/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Client;
import br.com.locadora.model.Contact;
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
public class ClientDal {
        private Connection conexao;
        public ClientDal() {
        conexao = Conexao.getConexao();
    }
        
        
        
        
      public Client addClient(Client client) {
        String sql = "INSERT INTO senai_locadora_pi3.client (fk_address_client,fk_contact_client)\n" +
"	VALUES (?,?);";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1        
            preparedStatement.setInt(1, client.getAddress().getId());
             preparedStatement.setInt(2, client.getContact().getId());
            preparedStatement.executeUpdate();
            
            preparedStatement = conexao.
            prepareStatement("Select LAST_INSERT_ID() as ultimoId;");
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                client.setId(rs.getInt("ultimoId"));                
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }
        
        
    
             public List<Client> getAllClient() {
        List<Client> clients = new ArrayList<Client>();
            String sql = "select * from client";
                    AddressDal address = new AddressDal();
                    ContactDal contact = new ContactDal();      
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Client client = new Client();
                    client.setId(rs.getInt("id"));
                    client.setAddress(address.getAddressById(rs.getInt("fk_address_client")));
                    client.setContact(contact.getContactById(rs.getInt("fk_contact_client")));
                    clients.add(client);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return clients;
    }
         
 public Client getClientById(int id) {
        Client client = new Client();
        AddressDal address = new AddressDal();
        ContactDal contact = new ContactDal();   
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from client where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                client.setId(rs.getInt("id"));    
                client.setAddress(address.getAddressById(rs.getInt("fk_address_client")));
                client.setContact(contact.getContactById(rs.getInt("fk_contact_client")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return client;
    }
    
}
