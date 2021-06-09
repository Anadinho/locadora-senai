/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.model;

/**
 *
 * @author suporte
 */
public class Vehicle {
    
    private String licensePlate;
    private int id;
    private Model model;
    private int renavam;
    private Category category;
    private double buyPrice;
    private double salePrice;
    private int numberPassengers;
    private String yearFabrication;
    private String yearModel;
    private String typeFuel;
    private int mileage;
    private VehicleType vehicleType;
    private SituationVehicle situationVehicle;
 

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
     * @return the model
     */
    public Model getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * @return the renavam
     */
    public int getRenavam() {
        return renavam;
    }

    /**
     * @param renavam the renavam to set
     */
    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the buyPrice
     */
    public double getBuyPrice() {
        return buyPrice;
    }

    /**
     * @param buyPrice the buyPrice to set
     */
    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    /**
     * @return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return the numberPassengers
     */
    public int getNumberPassengers() {
        return numberPassengers;
    }

    /**
     * @param numberPassengers the numberPassengers to set
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    /**
     * @return the yearFabrication
     */
    public String getYearFabrication() {
        return yearFabrication;
    }

    /**
     * @param yearFabrication the yearFabrication to set
     */
    public void setYearFabrication(String yearFabrication) {
        this.yearFabrication = yearFabrication;
    }

    /**
     * @return the yearModel
     */
    public String getYearModel() {
        return yearModel;
    }

    /**
     * @param yearModel the yearModel to set
     */
    public void setYearModel(String yearModel) {
        this.yearModel = yearModel;
    }

    /**
     * @return the typeFuel
     */
    public String getTypeFuel() {
        return typeFuel;
    }

    /**
     * @param typeFuel the typeFuel to set
     */
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }

    /**
     * @return the mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * @return the vehicleType
     */
    public VehicleType getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the situationVehicle
     */
    public SituationVehicle getSituationVehicle() {
        return situationVehicle;
    }

    /**
     * @param situationVehicle the situationVehicle to set
     */
    public void setSituationVehicle(SituationVehicle situationVehicle) {
        this.situationVehicle = situationVehicle;
    }

    
}
