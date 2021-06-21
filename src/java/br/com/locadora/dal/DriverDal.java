/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.City;
import br.com.locadora.model.ClientPf;
import br.com.locadora.model.ClientPj;
import br.com.locadora.model.Driver;
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
public class DriverDal {
    
      private Connection conexao;
        
        public DriverDal() {
        conexao = Conexao.getConexao();
    }
        
        
        public void addDriver(Driver driver) {
        String sql = "INSERT INTO driver ( cpf, name, identity, cnh, category, cnhValidity, urlCnh, fk_address_driver, fk_contact_driver)\n" +
"	VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1        
            preparedStatement.setString(1, driver.getCpf());
            preparedStatement.setString(2, driver.getName());
            preparedStatement.setString(3, driver.getIdentity());
            preparedStatement.setString(4, driver.getCnh());
            preparedStatement.setString(5, driver.getCategory());
            preparedStatement.setDate(6, new java.sql.Date(driver.getCnhValidity().getTime()));
            preparedStatement.setString(7, driver.getUrlCnh());
            preparedStatement.setInt(8, driver.getAddress().getId());
            preparedStatement.setInt(9, driver.getContact().getId());            
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        
         public List<Driver> getAllDriver() {
        List<Driver> drivers = new ArrayList<Driver>();
            String sql = "select * \n" +
"	from driver";
                    AddressDal address = new AddressDal();
                    ContactDal contact = new ContactDal();                   
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    Driver driver = new Driver();
                    driver.setCpf(rs.getString("cpf"));
                    driver.setId(rs.getInt("id"));
                    driver.setName(rs.getString("name"));
                    driver.setIdentity(rs.getString("identity"));
                    driver.setCnh(rs.getString("cnh"));
                    driver.setCategory(rs.getString("category"));
                    driver.setCnhValidity(rs.getDate("cnhValidity"));
                    driver.setUrlCnh(rs.getString("urlCnh"));
                    
                    driver.setAddress(address.getAddressById(rs.getInt("fk_address_driver")));                    
                    driver.setContact(contact.getContactById(rs.getInt("fk_contact_driver")));                    
                    drivers.add(driver);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return drivers;
    }
         
 public Driver getDriverById(String cpf) {
        Driver driver = new Driver();
        AddressDal address = new AddressDal();
        ContactDal contact = new ContactDal();
        
        try {
            PreparedStatement preparedStatement = conexao.
             prepareStatement("select * from driver where cpf=?");
            preparedStatement.setString(1,cpf);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                driver.setCpf(rs.getString("cpf"));
                driver.setId(rs.getInt("id"));
                driver.setName(rs.getString("name"));
                driver.setIdentity(rs.getString("identity"));
                driver.setCnh(rs.getString("cnh"));
                driver.setCnhValidity(rs.getDate("cnhValidity"));
                driver.setUrlCnh(rs.getString("urlCnh"));    
                driver.setAddress(address.getAddressById(rs.getInt("fk_address_driver")));
                driver.setContact(contact.getContactById(rs.getInt("fk_contact_driver")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return driver;
    }
 
 
          public List<City> getAllCity() {
        List<City> citys = new ArrayList<City>();
            String sql = "select * from city";
                      UfDal uf = new UfDal();
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   City city = new City();
                    city.setId(rs.getInt("id"));
                    city.setName(rs.getString("name"));
                    city.setUf(uf.getUfById(rs.getInt("fk_uf_city")));
                    citys.add(city);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return citys;
    }
    
}
