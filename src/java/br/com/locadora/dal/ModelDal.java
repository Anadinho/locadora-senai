/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.City;
import br.com.locadora.model.Model;
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
public class ModelDal {
    
            private Connection conexao;
        public ModelDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Model> getAllModel() {
        List<Model> models = new ArrayList<Model>();
            String sql = "select * from model";
                      BrandDal brand = new BrandDal();
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Model model = new Model();
                    model.setId(rs.getInt("id"));
                    model.setName(rs.getString("name"));
                    model.setBrand(brand.getBrandById(rs.getInt("fk_brand_model")));
                    models.add(model);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return models;
    }
         
          public Model getModelById(int id) {
        Model model = new Model();
        BrandDal brand = new BrandDal();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from model where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                model.setId(rs.getInt("id"));
                model.setName(rs.getString("name"));
                model.setBrand(brand.getBrandById(rs.getInt("fk_brand_model")));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return model;
    }
    
}
