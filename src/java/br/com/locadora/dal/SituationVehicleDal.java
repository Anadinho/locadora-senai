/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.SituationVehicle;
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
public class SituationVehicleDal {
    
      private Connection conexao;
        public SituationVehicleDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<SituationVehicle> getAllSituationVehicle() {
        List<SituationVehicle> situationVehicles = new ArrayList<SituationVehicle>();
            String sql = "select * from situationVehicle";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   SituationVehicle situationVehicle = new SituationVehicle();
                    situationVehicle.setId(rs.getInt("id"));
                    situationVehicle.setName(rs.getString("name"));
                    situationVehicles.add(situationVehicle);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return situationVehicles;
    }
         
 public SituationVehicle getSituationVehicleById(int id) {
        SituationVehicle situationVehicle = new SituationVehicle();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from situationVehicle where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                situationVehicle.setId(rs.getInt("id"));
                situationVehicle.setName(rs.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return situationVehicle;
    }
    
}
