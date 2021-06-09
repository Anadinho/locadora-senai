/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.Vehicle;
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
public class VehicleDal {
    
            private Connection conexao;
        
        public VehicleDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Vehicle> getAllVehicle() {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
            String sql = "select *\n" +
"	from vehicle v join model m on v.fk_model_vehicle =m.id";
                    CategoryDal  category= new CategoryDal();
                    ModelDal model = new ModelDal();
                    VehicleTypeDal vehicleType = new VehicleTypeDal();
                    SituationVehicleDal situationVehicle=  new SituationVehicleDal();
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    Vehicle vehicle = new Vehicle();
                    
                    vehicle.setLicensePlate(rs.getString("licensePlate"));
                    vehicle.setId(rs.getInt("id"));
                    
                    vehicle.setModel(model.getModelById(rs.getInt("fk_model_vehicle")));
                    vehicle.setRenavam(rs.getInt("renavam"));
                    
                    vehicle.setCategory(category.getCategoryById(rs.getInt("fk_category_vehicle")));
                    
                    vehicle.setBuyPrice(rs.getDouble("buyPrice"));
                    vehicle.setSalePrice(rs.getDouble("salePrice"));
                    vehicle.setNumberPassengers(rs.getInt("numberPassengers"));
                    vehicle.setYearFabrication(rs.getString("yearFabrication"));
                    vehicle.setYearModel(rs.getString("yearModel"));
                    vehicle.setTypeFuel(rs.getString("typeFuel"));
                    vehicle.setMileage(rs.getInt("mileage"));
                     vehicle.setVehicleType(vehicleType.getVehicleTypeById(rs.getInt("fk_type_vehicle")));
                     vehicle.setSituationVehicle(situationVehicle.getSituationVehicleById(rs.getInt("fk_situation_vehicle")));
                     
                   
                    vehicles.add(vehicle);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return vehicles;
    }
         
 public Vehicle getVehicleById(String placa) {
        Vehicle vehicle = new Vehicle();
        CategoryDal  category= new CategoryDal();
        ModelDal model = new ModelDal();
        VehicleTypeDal vehicleType = new VehicleTypeDal();
        SituationVehicleDal situationVehicle=  new SituationVehicleDal();
        try {
            PreparedStatement preparedStatement = conexao.
             prepareStatement("select * from vehicle where licensePlate=?");
            preparedStatement.setString(1,placa);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                    vehicle.setLicensePlate(rs.getString("licensePlate"));
                    vehicle.setId(rs.getInt("id"));
                    vehicle.setRenavam(rs.getInt("renavam"));
                    vehicle.setBuyPrice(rs.getDouble("buyPrice"));
                    vehicle.setSalePrice(rs.getDouble("salePrice"));
                    vehicle.setNumberPassengers(rs.getInt("numberPassengers"));
                    vehicle.setYearFabrication(rs.getString("yearFabrication"));
                    vehicle.setYearModel(rs.getString("yearModel"));
                    vehicle.setTypeFuel(rs.getString("typeFuel"));
                    vehicle.setMileage(rs.getInt("mileage"));
                    vehicle.setVehicleType(vehicleType.getVehicleTypeById(rs.getInt("fk_type_vehicle")));
                    vehicle.setSituationVehicle(situationVehicle.getSituationVehicleById(rs.getInt("fk_situation_vehicle")));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vehicle;
    }
}
