/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.StatusAccessories;
import br.com.locadora.model.VehicleType;
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
public class StatusAccessoriesDal {
    
        
          private Connection conexao;
        public StatusAccessoriesDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<StatusAccessories> getAllStatusAccessories() {
        List<StatusAccessories> statusAccessoriess = new ArrayList<StatusAccessories>();
            String sql = "select * from statusAccessories";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   StatusAccessories statusAccessories = new StatusAccessories();
                    statusAccessories.setId(rs.getInt("id"));
                    statusAccessories.setName(rs.getString("name"));
                    statusAccessoriess.add(statusAccessories);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return statusAccessoriess;
    }
         
 public StatusAccessories getStatusAccessoriesById(int id) {
        StatusAccessories statusAccessories = new StatusAccessories();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from statusAccessories where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                statusAccessories.setId(rs.getInt("id"));
                statusAccessories.setName(rs.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return statusAccessories;
    }
}
