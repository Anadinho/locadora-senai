/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Uf;
import br.com.locadora.util.Conexao;
import java.sql.Connection;
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
                    ufs.add(uf);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return ufs;
    }
    
}
