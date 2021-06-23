/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.Driver;
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
        
        
        
          public void addRental(Rental rental) {
            String sql = "INSERT INTO senai_locadora_pi3.rental (fk_vehicle_rental,fk_client_rental,fk_driver_rental,dateRental,dateScheduledDevolution,initialMileage,finalMileage,priceRental,priceGuarantee,priceInsuranceCar,priceInsuranceRental,priceTotal,lateFee,trafficTicket,litersFuel)\n" +
            "	VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            try {
                PreparedStatement preparedStatement = conexao
                        .prepareStatement(sql);
                // Parameters start with 1     
                preparedStatement.setString(1, rental.getVehicle().getLicensePlate());
                preparedStatement.setInt(2, rental.getClient().getId());
                preparedStatement.setString(3, rental.getDriver().getCpf());
                preparedStatement.setDate(4, new java.sql.Date(rental.getDateRental().getTime()));
                preparedStatement.setDate(5, new java.sql.Date(rental.getDateScheduledDevolution().getTime()));
//                preparedStatement.setDate(6, new java.sql.Date(rental.getDateDevolution().getTime()));
                preparedStatement.setInt(6, rental.getInitialMileage());
                preparedStatement.setInt(7, rental.getFinalMileage());
                preparedStatement.setDouble(8, rental.getPriceRental());
                preparedStatement.setDouble(9, rental.getPriceGuarantee());
                preparedStatement.setDouble(10, rental.getPriceInsuranceCar());
                preparedStatement.setDouble(11, rental.getPriceInsuranceRental());
                preparedStatement.setDouble(12, rental.getPriceTotal());
                preparedStatement.setString(13, rental.getLateFee());;
                preparedStatement.setString(14, rental.getTrafficTicket());
                preparedStatement.setInt(15, rental.getLitersFuel());
                            

                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
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
                    rental.setPriceTotal(rs.getDouble("priceTotal"));
                    rental.setLateFee(rs.getString("lateFee"));
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
                    rental.setPriceTotal(rs.getDouble("priceTotal"));
                    rental.setLateFee(rs.getString("lateFee"));
                    rental.setTrafficTicket(rs.getString("trafficTicket"));
                    rental.setLitersFuel(rs.getInt("litersFuel"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rental;
    }
    
}
