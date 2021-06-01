package model;

import java.util.Date;

public class Veiculo {

    private int renavam;
    private String placa;
    private String marca;
    private String modelo;
    private String tipoCarro;
    private String categoria;
    private double valorCompra;
    private double valorVenda;
    private int numeroPassageiros;
    private int anoFabricacao;
    private int anoModelo;
    private String tipoCombustivel;
    private int quilometragem;
    private boolean statusDisponivel;

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public boolean isStatusDisponivel() {
        return statusDisponivel;
    }

    public void setStatusDisponivel(boolean statusDisponivel) {
        this.statusDisponivel = statusDisponivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }


    @Override
    public String toString() {
        return "Veiculo{" + "renavam=" + renavam + ", placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", tipoCarro=" + tipoCarro + ", categoria=" + categoria + ", valorCompra=" + valorCompra + ", valorVenda=" + valorVenda + ", numeroPassageiros=" + numeroPassageiros + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", tipoCombustivel=" + tipoCombustivel + ", quilometragem=" + quilometragem + ", statusDisponivel=" + statusDisponivel + '}';
    }

}
