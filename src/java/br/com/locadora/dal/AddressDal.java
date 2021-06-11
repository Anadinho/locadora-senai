/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.City;
import br.com.locadora.model.Contact;
import br.com.locadora.model.Uf;
import br.com.locadora.util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author suporte
 */
public class AddressDal {
        private Connection conexao;
        
        public AddressDal() {
        conexao = Conexao.getConexao();
    }
        
        
        
                 public Address addAddress(Address address) {
        String sql = "INSERT INTO senai_locadora_pi3.address (cep, numberAddress, complement, district, fk_city_address, logradouro)\n" +
"	VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1        
            preparedStatement.setString(1, address.getCep());
            preparedStatement.setInt(2, address.getNumberAddress());
             preparedStatement.setString(3, address.getComplement());
             preparedStatement.setString(4, address.getDistrict());
             preparedStatement.setInt(5, address.getCity().getId());
             preparedStatement.setString(6, address.getLogradouro());
               
            preparedStatement.executeUpdate();
            
            preparedStatement = conexao.
            prepareStatement("Select LAST_INSERT_ID() as ultimoId;");
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                address.setId(rs.getInt("ultimoId"));                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return address;
    }
        
        
         public List<Address> getAllAddress() {
        List<Address> addresss = new ArrayList<Address>();
            String sql = "select * from address";

                    CityDal city = new CityDal();
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    Address address = new Address();
                    address.setId(rs.getInt("id"));
                    address.setCep(rs.getString("cep"));
                    address.setNumberAddress(rs.getInt("numberAddress"));
                    address.setComplement(rs.getString("complement"));
                    address.setDistrict(rs.getString("district"));
                    address.setCity(city.getCityById(rs.getInt("fk_city_address")));
                    address.setLogradouro(rs.getString("logradouro"));
                    
                    addresss.add(address);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return addresss;
    }
         
 public Address getAddressById(int id) {
        Address address = new Address();
        CityDal city = new CityDal();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from address where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                address.setId(rs.getInt("id"));
                address.setCep(rs.getString("cep"));
                address.setNumberAddress(rs.getInt("numberAddress"));
                address.setComplement(rs.getString("complement"));
                address.setDistrict(rs.getString("district"));
                address.setLogradouro(rs.getString("logradouro"));
                address.setCity(city.getCityById(rs.getInt("fk_city_address")));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return address;
    }
    
}
