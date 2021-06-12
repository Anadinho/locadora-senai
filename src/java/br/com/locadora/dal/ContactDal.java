/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.dal;

import br.com.locadora.model.Contact;
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
public class ContactDal {
    private Connection conexao;
        public ContactDal() {
        conexao = Conexao.getConexao();
    }
        
        
        
         public Contact addContact(Contact contact) {
        String sql = "INSERT INTO contact (email, telephone)VALUES (?, ?);";
        try {
            PreparedStatement preparedStatement = conexao
                    .prepareStatement(sql);
            // Parameters start with 1        
            preparedStatement.setString(1, contact.getEmail());
            preparedStatement.setString(2, contact.getTelephone());
            preparedStatement.executeUpdate();
            
            preparedStatement = conexao.
            prepareStatement("Select LAST_INSERT_ID() as ultimoId;");
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                contact.setId(rs.getInt("ultimoId"));                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contact;
    }
        
        
         public List<Contact> getAllContact() {
        List<Contact> contacts = new ArrayList<Contact>();
            String sql = "select * from contact";
                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                   Contact contact = new Contact();
                    contact.setId(rs.getInt("id"));
                    contact.setEmail(rs.getString("email"));
                    contact.setTelephone(rs.getString("telephone"));
                    contacts.add(contact);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return contacts;
    }
         
 public Contact getContactById(int id) {
        Contact contact = new Contact();
        try {
            PreparedStatement preparedStatement = conexao.
                    prepareStatement("select * from contact where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                contact.setId(rs.getInt("id"));
                contact.setEmail(rs.getString("email"));
                contact.setTelephone(rs.getString("telephone"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return contact;
    }
    
}
