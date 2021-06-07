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
        
        
         public List<ClientPf> getAllClientPf() {
        List<ClientPf> clientPfs = new ArrayList<ClientPf>();
            String sql = "select * \n" +
"	from clientPf pf join client c on pf.fk_client_pf =c.id\n" +
"	join address a on a.id =c.fk_address_client;";
//                    ClientDal client = new ClientDal();
                    AddressDal address = new AddressDal();
                    ContactDal contact = new ContactDal();
                    UfDal uf = new UfDal();
                    CityDal city = new CityDal();
                     

                            
            try {
                Statement statement = conexao.createStatement();
                ResultSet rs = statement.executeQuery(sql);
                while (rs.next()) {
                    ClientPf pf = new ClientPf();
                    pf.setId(rs.getInt("id"));
                    pf.setIdentity(rs.getString("identity"));
                    pf.setName(rs.getString("name"));  
                    pf.setAddress(address.getAddressById(rs.getInt("fk_address_client")));
                    pf.setContact(contact.getContactById(rs.getInt("fk_contact_client")));
                    pf.setUf(uf.getUfById(rs.getInt("fk_uf_address")));
                    pf.setCity(city.getCityById(rs.getInt("fk_city_address")));
                    clientPfs.add(pf);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return clientPfs;
    }
         
 public ClientPf getClientPfById(int id) {
        ClientPf clientPf = new ClientPf();
        try {
            PreparedStatement preparedStatement = conexao.
             prepareStatement("select * from clientPf where id=?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                clientPf.setId(rs.getInt("id"));
                clientPf.setIdentity(rs.getString("identity"));
                clientPf.setName(rs.getString("name"));                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientPf;
    }
    
}
