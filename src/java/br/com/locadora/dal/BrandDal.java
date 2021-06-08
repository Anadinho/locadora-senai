/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Brand;
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
public class BrandDal {
    private Connection conexao;
        public BrandDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Brand> getAllBrand() {
        List<Brand> brands = new ArrayList<Brand>();
            String sql = "select * from brand";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Brand brand = new Brand();
                    brand.setId(rs.getInt("id"));
                    brand.setName(rs.getString("name"));
                    brands.add(brand);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return brands;
    }
         
 public Brand getBrandById(int id) {
        Brand brand = new Brand();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from brand where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                brand.setId(rs.getInt("id"));
                brand.setName(rs.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return brand;
    }
    
}
