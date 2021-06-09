/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.TypeAccessories;
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
public class TypeAccessoriesDal {
    
    
    private Connection conexao;
        public TypeAccessoriesDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<TypeAccessories> getAllTypeAccessories() {
        List<TypeAccessories> typeAccessoriess = new ArrayList<TypeAccessories>();
            String sql = "select * from typeAccessories";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   TypeAccessories typeAccessories = new TypeAccessories();
                    typeAccessories.setId(rs.getInt("id"));
                    typeAccessories.setName(rs.getString("name"));
                    typeAccessoriess.add(typeAccessories);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return typeAccessoriess;
    }
         
 public TypeAccessories getTypeAccessoriesById(int id) {
        TypeAccessories typeAccessories = new TypeAccessories();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from typeAccessories where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                typeAccessories.setId(rs.getInt("id"));
                typeAccessories.setName(rs.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return typeAccessories;
    }
    
}
