/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Address;
import br.com.locadora.model.ClientPf;
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
public class ClientPfDal {
    
          private Connection conexao;
        
        public ClientPfDal() {
        conexao = Conexao.getConexao();
    }
        
        
             public void addClientPf(ClientPf clientPf) {
        String sql = "INSERT INTO clientPf ( cpf, identity, name, fk_client_pf)\n" +
"	VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1        
            preparedStatement.setString(1, clientPf.getCpf());
            preparedStatement.setString(2, clientPf.getIdentity());
            preparedStatement.setString(3, clientPf.getName());
            preparedStatement.setInt(4, clientPf.getClient().getId());
           
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        
        
         public List<ClientPf> getAllClientPf() {
        List<ClientPf> clientPfs = new ArrayList<ClientPf>();
            String sql = "select * \n" +
"	from clientPf pf ;";
                    ClientDal client = new ClientDal();
                     

                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    ClientPf pf = new ClientPf();
                    pf.setCpf(rs.getString("cpf"));
                    pf.setId(rs.getInt("id"));
                    pf.setIdentity(rs.getString("identity"));
                    pf.setName(rs.getString("name"));  
                    pf.setClient(client.getClientById(rs.getInt("fk_client_pf")));
                    clientPfs.add(pf);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return clientPfs;
    }
         
 public ClientPf getClientPfById(int fk_client_pf) {
        ClientPf clientPf = new ClientPf(); 
         ClientDal client = new ClientDal();
        try {
            PreparedStatement preparedStatement = conexao.
             prepareStatement("select * from clientPf where fk_client_pf=?");
            preparedStatement.setInt(1,fk_client_pf);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                clientPf.setCpf(rs.getString("cpf"));
                clientPf.setId(rs.getInt("id"));
                clientPf.setIdentity(rs.getString("identity"));
                clientPf.setName(rs.getString("name"));
                clientPf.setClient(client.getClientById(rs.getInt("fk_client_pf")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientPf;
    }
    
}
