/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Category;
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
public class CategoryDal {
    
        private Connection conexao;
        public CategoryDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Category> getAllCategory() {
        List<Category> categorys = new ArrayList<Category>();
            String sql = "select * from category";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Category category = new Category();
                    category.setId(rs.getInt("id"));
                    category.setName(rs.getString("name"));
                    category.setValor(rs.getDouble("valor"));
                    categorys.add(category);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return categorys;
    }
         
 public Category getCategoryById(int id) {
        Category category = new Category();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from category where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                category.setValor(rs.getDouble("valor"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return category;
    }
    
}
