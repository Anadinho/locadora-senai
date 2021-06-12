/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Uf;
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
public class UfDal {
    
    private Connection conexao;
        public UfDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<Uf> getAllUf() {
        List<Uf> ufs = new ArrayList<Uf>();
            String sql = "select * from uf";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Uf uf = new Uf();
                    uf.setId(rs.getInt("id"));
                    uf.setName(rs.getString("name"));
                    uf.setUf(rs.getString("uf"));
                    ufs.add(uf);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return ufs;
    }
         
 public Uf getUfById(int id) {
        Uf uf = new Uf();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from uf where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                uf.setId(rs.getInt("id"));
                uf.setName(rs.getString("name"));
                uf.setUf(rs.getString("uf"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return uf;
    }
    
}
