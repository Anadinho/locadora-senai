/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Veiculo;

/**
 *
 * @author Cabral
 */
public class VeiculoDao {
    private Connection connection;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs; 

 public void Inserir(Veiculo veiculo) throws SQLException {
        String sql = "INSERT INTO veiculo (renavam, placa, marca, modelo, tipoCarro,categoria, valorCompra, valorVenda, numeroPassageiros, anoFabricacao, anoModelo, tipoCombustivel, quilometragem, statusDisponivel) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ? , ? , ? , ?)";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, veiculo.getRenavam());
            stmt.setString(2, veiculo.getPlaca());
            stmt.setString(3, veiculo.getMarca());
            stmt.setString(4, veiculo.getModelo());
            stmt.setString(5, veiculo.getTipoCarro());
            stmt.setString(6, veiculo.getCategoria());
            stmt.setDouble(7, veiculo.getValorCompra());
            stmt.setDouble(8, veiculo.getValorVenda());
            stmt.setInt(9, veiculo.getNumeroPassageiros());
            stmt.setInt(10, veiculo.getAnoFabricacao());
            stmt.setInt(11, veiculo.getAnoModelo());
            stmt.setString(12, veiculo.getTipoCombustivel());
            stmt.setInt(13, veiculo.getQuilometragem());
            stmt.setInt(14, veiculo.isStatusDisponivel()?1:0);
          
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new RuntimeException("Erro no Inserir do VeiculoDao" + e);
        }
    }
 
 

}

