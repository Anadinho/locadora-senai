/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Cabral
 */
public class locacoes {

    private int idlocacoes;
    private String placaVeiculo;
    private String cpfcnpjCliente;
    private String cpfMotorista;
    private Date retirada;
    private Date devolução;
    private int quilometragemInicial;
    private int quilometragemFinal;
    private double valorLocacao;
    private double valorCaucao;
    private double valorSeguro;
    private double valorPercentSeguro;
    private boolean temMultaAtraso;
    private boolean tanqueCheioDevolucao;

    public int getIdlocacoes() {
        return idlocacoes;
    }

    public void setIdlocacoes(int idlocacoes) {
        this.idlocacoes = idlocacoes;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getCpfcnpjCliente() {
        return cpfcnpjCliente;
    }

    public void setCpfcnpjCliente(String cpfcnpjCliente) {
        this.cpfcnpjCliente = cpfcnpjCliente;
    }

    public String getCpfMotorista() {
        return cpfMotorista;
    }

    public void setCpfMotorista(String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }

    public Date getRetirada() {
        return retirada;
    }

    public void setRetirada(Date retirada) {
        this.retirada = retirada;
    }

    public Date getDevolução() {
        return devolução;
    }

    public void setDevolução(Date devolução) {
        this.devolução = devolução;
    }

    public int getQuilometragemInicial() {
        return quilometragemInicial;
    }

    public void setQuilometragemInicial(int quilometragemInicial) {
        this.quilometragemInicial = quilometragemInicial;
    }

    public int getQuilometragemFinal() {
        return quilometragemFinal;
    }

    public void setQuilometragemFinal(int quilometragemFinal) {
        this.quilometragemFinal = quilometragemFinal;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorCaucao() {
        return valorCaucao;
    }

    public void setValorCaucao(double valorCaucao) {
        this.valorCaucao = valorCaucao;
    }

    public double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public double getValorPercentSeguro() {
        return valorPercentSeguro;
    }

    public void setValorPercentSeguro(double valorPercentSeguro) {
        this.valorPercentSeguro = valorPercentSeguro;
    }

    public boolean isTemMultaAtraso() {
        return temMultaAtraso;
    }

    public void setTemMultaAtraso(boolean temMultaAtraso) {
        this.temMultaAtraso = temMultaAtraso;
    }

    public boolean isTanqueCheioDevolucao() {
        return tanqueCheioDevolucao;
    }

    public void setTanqueCheioDevolucao(boolean tanqueCheioDevolucao) {
        this.tanqueCheioDevolucao = tanqueCheioDevolucao;
    }

    @Override
    public String toString() {
        return "locacoes{" + "idlocacoes=" + idlocacoes + ", placaVeiculo=" + placaVeiculo + ", cpfcnpjCliente=" + cpfcnpjCliente + ", cpfMotorista=" + cpfMotorista + ", retirada=" + retirada + ", devolu\u00e7\u00e3o=" + devolução + ", quilometragemInicial=" + quilometragemInicial + ", quilometragemFinal=" + quilometragemFinal + ", valorLocacao=" + valorLocacao + ", valorCaucao=" + valorCaucao + ", valorSeguro=" + valorSeguro + ", valorPercentSeguro=" + valorPercentSeguro + ", temMultaAtraso=" + temMultaAtraso + ", tanqueCheioDevolucao=" + tanqueCheioDevolucao + '}';
    }
    
    
    
}
