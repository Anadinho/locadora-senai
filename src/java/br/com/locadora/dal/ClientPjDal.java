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
"	from clientPj pj join client c on pj.fk_client_pj =c.id\n" +
"	join address a on a.id =c.fk_address_client";
                    AddressDal address = new AddressDal();
                    ContactDal contact = new ContactDal();
                     

                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    ClientPj pj = new ClientPj();
                    pj.setId(rs.getInt("id"));
                    pj.setFantasyName(rs.getString("fantasyName"));
                    pj.setRazaoSocial(rs.getString("razaoSocial"));                  
                    pj.setAddress(address.getAddressById(rs.getInt("fk_address_client")));                    
                    pj.setContact(contact.getContactById(rs.getInt("fk_contact_client")));
                    
                    clientPjs.add(pj);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return clientPjs;
    }
         
 public ClientPj getClientPjById(int id) {
        ClientPj clientPj = new ClientPj();
        AddressDal address = new AddressDal();
        ContactDal contact = new ContactDal();
        try {
            PreparedStatement preparedStatement = conexao.
            prepareStatement("select * from clientPj where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                clientPj.setId(rs.getInt("id"));
                clientPj.setFantasyName(rs.getString("fantasyName"));
                clientPj.setRazaoSocial(rs.getString("razaoSocial"));  
                clientPj.setAddress(address.getAddressById(rs.getInt("fk_address_client")));                    
                clientPj.setContact(contact.getContactById(rs.getInt("fk_contact_client")));
                    
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientPj;
    }
    
}
