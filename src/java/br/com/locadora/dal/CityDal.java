/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

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
public class CityDal {
    
        private Connection conexao;
        public CityDal() {
        conexao = Conexao.getConexao();
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
         
          public City getCityById(int id) {
        City city = new City();
        UfDal uf = new UfDal();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from city where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                city.setId(rs.getInt("id"));
                city.setName(rs.getString("name"));
                city.setUf(uf.getUfById(rs.getInt("fk_uf_city")));               
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return city;
    }
    
}
