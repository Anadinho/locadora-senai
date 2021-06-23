/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.model;
import java.util.Date;

import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class
/**
 *
 * @author suporte
 */
public class Rental {

    /**
     * @return the lateFee
     */
    public String getLateFee() {
        return lateFee;
    }

    /**
     * @param lateFee the lateFee to set
     */
    public void setLateFee(String lateFee) {
        this.lateFee = lateFee;
    }

    /**
     * @return the priceTotal
     */
    public double getPriceTotal() {
        return priceTotal;
    }

    /**
     * @param priceTotal the priceTotal to set
     */
    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }



    private int id;
    private ClientPf clientPf;
    private ClientPj clientPj;
    private Vehicle vehicle;
    private Driver driver;
    private  Date dateRental;
    private  Date dateScheduledDevolution;
    private  Date dateDevolution;
    private int initialMileage;
    private int finalMileage;
    private double priceRental;
    private double priceGuarantee;
    private double priceInsuranceCar;
    private double priceInsuranceRental;
    private double priceTotal;
    private String lateFee;
    private String trafficTicket;
    private int litersFuel;
    private Client client;

    
        /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
    /**
     * @return the clientPj
     */
    public ClientPj getClientPj() {
        return clientPj;
    }

    /**
     * @param clientPj the clientPj to set
     */
    public void setClientPj(ClientPj clientPj) {
        this.clientPj = clientPj;
    }
    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the driver
     */
    public Driver getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    /**
     * @return the dateRental
     */
    public Date getDateRental() {
        return dateRental;
    }

    /**
     * @param dateRental the dateRental to set
     */
    public void setDateRental(Date dateRental) {
        this.dateRental = dateRental;
    }

    /**
     * @return the dateDevolution
     */
    public Date getDateDevolution() {
        return dateDevolution;
    }

    /**
     * @param dateDevolution the dateDevolution to set
     */
    public void setDateDevolution(Date dateDevolution) {
        this.dateDevolution = dateDevolution;
    }

    /**
     * @return the initialMileage
     */
    public int getInitialMileage() {
        return initialMileage;
    }

    /**
     * @param initialMileage the initialMileage to set
     */
    public void setInitialMileage(int initialMileage) {
        this.initialMileage = initialMileage;
    }

    /**
     * @return the finalMileage
     */
    public int getFinalMileage() {
        return finalMileage;
    }

    /**
     * @param finalMileage the finalMileage to set
     */
    public void setFinalMileage(int finalMileage) {
        this.finalMileage = finalMileage;
    }

    /**
     * @return the priceRental
     */
    public double getPriceRental() {
        return priceRental;
    }

    /**
     * @param priceRental the priceRental to set
     */
    public void setPriceRental(double priceRental) {
        this.priceRental = priceRental;
    }

    /**
     * @return the priceGuarantee
     */
    public double getPriceGuarantee() {
        return priceGuarantee;
    }

    /**
     * @param priceGuarantee the priceGuarantee to set
     */
    public void setPriceGuarantee(double priceGuarantee) {
        this.priceGuarantee = priceGuarantee;
    }

    /**
     * @return the priceInsuranceCar
     */
    public double getPriceInsuranceCar() {
        return priceInsuranceCar;
    }

    /**
     * @param priceInsuranceCar the priceInsuranceCar to set
     */
    public void setPriceInsuranceCar(double priceInsuranceCar) {
        this.priceInsuranceCar = priceInsuranceCar;
    }

    /**
     * @return the priceInsuranceRental
     */
    public double getPriceInsuranceRental() {
        return priceInsuranceRental;
    }

    /**
     * @param priceInsuranceRental the priceInsuranceRental to set
     */
    public void setPriceInsuranceRental(double priceInsuranceRental) {
        this.priceInsuranceRental = priceInsuranceRental;
    }

    /**
     * @return the trafficTicket
     */
    public String getTrafficTicket() {
        return trafficTicket;
    }

    /**
     * @param trafficTicket the trafficTicket to set
     */
    public void setTrafficTicket(String trafficTicket) {
        this.trafficTicket = trafficTicket;
    }

    /**
     * @return the litersFuel
     */
    public int getLitersFuel() {
        return litersFuel;
    }

    /**
     * @param litersFuel the litersFuel to set
     */
    public void setLitersFuel(int litersFuel) {
        this.litersFuel = litersFuel;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the dateScheduledDevolution
     */
    public Date getDateScheduledDevolution() {
        return dateScheduledDevolution;
    }

    /**
     * @param dateScheduledDevolution the dateScheduledDevolution to set
     */
    public void setDateScheduledDevolution(Date dateScheduledDevolution) {
        this.dateScheduledDevolution = dateScheduledDevolution;
    }

    /**
     * @return the clientPf
     */
    public ClientPf getClientPf() {
        return clientPf;
    }

    /**
     * @param clientPf the clientPf to set
     */
    public void setClientPf(ClientPf clientPf) {
        this.clientPf = clientPf;
    }
    
}
