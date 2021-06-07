/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.City;
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
        
        
         public List<Address> getAllAddress() {
        List<Address> addresss = new ArrayList<Address>();
            String sql = "select * from address";
                    UfDal uf = new UfDal();
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
                    address.setUf(uf.getUfById(rs.getInt("fk_uf_address")));
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
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return address;
    }
    
}
