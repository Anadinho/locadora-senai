/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.model;

import java.util.Date;

/**
 *
 * @author suporte
 */
public class Driver {
    private int id;
    private String cpf;
    private String name;
    private String identity;
    private String cnh;
    private String category;
    private Date cnhValidity;
    private String urlCnh;
    
    
    private Address address;
    private Contact contact;
    private Uf uf;
    private City city;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the cnh
     */
    public String getCnh() {
        return cnh;
    }

    /**
     * @param cnh the cnh to set
     */
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the cnhValidity
     */
    public Date getCnhValidity() {
        return cnhValidity;
    }

    /**
     * @param cnhValidity the cnhValidity to set
     */
    public void setCnhValidity(Date cnhValidity) {
        this.cnhValidity = cnhValidity;
    }

    /**
     * @return the urlCnh
     */
    public String getUrlCnh() {
        return urlCnh;
    }

    /**
     * @param urlCnh the urlCnh to set
     */
    public void setUrlCnh(String urlCnh) {
        this.urlCnh = urlCnh;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    /**
     * @return the uf
     */
    public Uf getUf() {
        return uf;
    }

    /**
     * @param uf the uf to set
     */
    public void setUf(Uf uf) {
        this.uf = uf;
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the identity
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * @param identity the identity to set
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    
}
