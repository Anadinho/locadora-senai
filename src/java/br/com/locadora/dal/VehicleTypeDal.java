/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;


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
public class VehicleTypeDal {
    
          private Connection conexao;
        public VehicleTypeDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<VehicleType> getAllVehicleType() {
        List<VehicleType> vehicleTypes = new ArrayList<VehicleType>();
            String sql = "select * from vehicleType";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   VehicleType vehicleType = new VehicleType();
                    vehicleType.setId(rs.getInt("id"));
                    vehicleType.setName(rs.getString("name"));
                    vehicleTypes.add(vehicleType);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return vehicleTypes;
    }
         
 public VehicleType getVehicleTypeById(int id) {
        VehicleType vehicleType = new VehicleType();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from vehicleType where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                vehicleType.setId(rs.getInt("id"));
                vehicleType.setName(rs.getString("name"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicleType;
    }
    
}
