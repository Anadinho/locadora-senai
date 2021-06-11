/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.Rental;
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
public class RentalDal {
    
            private Connection conexao;
        
        public RentalDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Rental> getAllRental() {
        List<Rental> rentals = new ArrayList<Rental>();
            String sql = "select * from rental";
                    VehicleDal vehicle = new VehicleDal();
                    ClientPfDal clientPf = new ClientPfDal();
                    ClientPjDal clientPj = new ClientPjDal();
                    DriverDal driver = new DriverDal();
                    ClientDal client = new ClientDal();

                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    Rental rental = new Rental();
                    rental.setId(rs.getInt("id"));
                    rental.setVehicle(vehicle.getVehicleById(rs.getString("fk_vehicle_rental")));
                    rental.setClientPf(clientPf.getClientPfById(rs.getInt("fk_client_rental")));
                    rental.setClientPj(clientPj.getClientPjById(rs.getInt("fk_client_rental")));
                    rental.setDriver(driver.getDriverById(rs.getString("fk_driver_rental")));
                    rental.setDateRental(rs.getDate("dateRental"));
                    rental.setDateDevolution(rs.getDate("dateDevolution"));
                    rental.setDateScheduledDevolution(rs.getDate("dateScheduledDevolution"));
                    rental.setInitialMileage(rs.getInt("initialMileage"));
                    rental.setFinalMileage(rs.getInt("finalMileage"));
                    rental.setPriceRental(rs.getDouble("priceRental"));
                    rental.setPriceGuarantee(rs.getDouble("priceGuarantee"));
                    rental.setPriceInsuranceCar(rs.getDouble("priceInsuranceCar"));
                    rental.setPriceInsuranceRental(rs.getDouble("priceInsuranceRental"));
                    rental.setTrafficTicket(rs.getString("trafficTicket"));
                    rental.setLitersFuel(rs.getInt("litersFuel"));
                    
                    rentals.add(rental);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return rentals;
    }
         
 public Rental getRentalById(int id) {
                    Rental rental = new Rental();
                    VehicleDal vehicle = new VehicleDal();
                    ClientPfDal clientPf = new ClientPfDal();
                    ClientPjDal clientPj = new ClientPjDal();
                    DriverDal driver = new DriverDal();
                    ClientDal client = new ClientDal();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from rental where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                    rental.setId(rs.getInt("id"));
                    rental.setVehicle(vehicle.getVehicleById(rs.getString("fk_vehicle_rental")));
                   rental.setClientPf(clientPf.getClientPfById(rs.getInt("fk_client_rental")));
                    rental.setClientPj(clientPj.getClientPjById(rs.getInt("fk_client_rental")));
                    rental.setDriver(driver.getDriverById(rs.getString("fk_driver_rental")));
                    rental.setDateRental(rs.getDate("dateRental"));
                    rental.setDateScheduledDevolution(rs.getDate("dateScheduledDevolution"));
                    rental.setInitialMileage(rs.getInt("initialMileage"));
                    rental.setFinalMileage(rs.getInt("finalMileage"));
                    rental.setPriceRental(rs.getDouble("priceRental"));
                    rental.setPriceGuarantee(rs.getDouble("priceGuarantee"));
                    rental.setPriceInsuranceCar(rs.getDouble("priceInsuranceCar"));
                    rental.setPriceInsuranceRental(rs.getDouble("priceInsuranceRental"));
                    rental.setTrafficTicket(rs.getString("trafficTicket"));
                    rental.setLitersFuel(rs.getInt("litersFuel"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rental;
    }
    
}
