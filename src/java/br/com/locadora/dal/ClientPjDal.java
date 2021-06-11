/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.ClientPf;
import br.com.locadora.model.ClientPj;
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
public class ClientPjDal {
    
        
          private Connection conexao;
        
        public ClientPjDal() {
        conexao = Conexao.getConexao();
    }
        
        
         public List<ClientPj> getAllClientPj() {
        List<ClientPj> clientPjs = new ArrayList<ClientPj>();
            String sql = "select * \n" +
"	from clientPj pj ";
                    ClientDal client = new ClientDal();
                     

                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    ClientPj pj = new ClientPj();
                    pj.setCnpj(rs.getString("cnpj"));
                    pj.setId(rs.getInt("id"));
                    pj.setFantasyName(rs.getString("fantasyName"));
                    pj.setRazaoSocial(rs.getString("razaoSocial"));                  
                    pj.setClient(client.getClientById(rs.getInt("fk_client_pj")));    
                    
                    clientPjs.add(pj);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return clientPjs;
    }
         
 public ClientPj getClientPjById(int fk_client_pj) {
        ClientPj pj = new ClientPj();
        ClientDal client = new ClientDal();

        try {
            PreparedStatement preparedStatement = conexao.
            prepareStatement("select * from clientPj where fk_client_pj=?");
            preparedStatement.setInt(1,fk_client_pj);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                    pj.setCnpj(rs.getString("cnpj"));
                    pj.setId(rs.getInt("id"));
                    pj.setFantasyName(rs.getString("fantasyName"));
                    pj.setRazaoSocial(rs.getString("razaoSocial"));                  
                    pj.setClient(client.getClientById(rs.getInt("fk_client_pj")));    
                    
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pj;
    }
    
}
