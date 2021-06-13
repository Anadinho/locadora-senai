/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.bll;

import br.com.locadora.dal.AddressDal;
import br.com.locadora.dal.CityDal;
import br.com.locadora.dal.ClientDal;
import br.com.locadora.dal.ClientPfDal;
import br.com.locadora.dal.ContactDal;
import br.com.locadora.model.Address;
import br.com.locadora.model.City;
import br.com.locadora.model.Client;
import br.com.locadora.model.ClientPf;
import br.com.locadora.model.Contact;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author suporte
 */
@WebServlet(name = "ClientPfController", urlPatterns = {"/ClientPfController"})
public class ClientPfController extends HttpServlet {
        private static String INSERT_OR_EDIT = "/cadastrarClient.jsp";
    private static String EDIT = "/editarClientPf.jsp";
    private static String LIST_USER = "/listarClientPf.jsp";
//    private static String LIST_USER = "/cadastrarClient.jsp";
    
    private ClientPfDal dal;
    private ContactDal dalContact;
    private AddressDal dalAddress;
    private CityDal dalCity;
    private ClientDal dalClient;
    
    
    
    
        public ClientPfController() {
        super();
        dal = new ClientPfDal();
        dalContact=new ContactDal();
        dalAddress= new AddressDal();
        dalCity=new CityDal();
        dalClient= new ClientDal();
    }
        
  

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClientPfController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClientPfController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             String forward="";
            String action = request.getParameter("action");
            
            if(action.equalsIgnoreCase("listarClientPf")){
                 forward = LIST_USER;
                 request.setAttribute("clientPfs", dal.getAllClientPf());
                     
                  
        } else  if(action.equalsIgnoreCase("cadastrarClientPf")){
             request.setAttribute("citys", dal.getAllCity()); 
             forward = INSERT_OR_EDIT;
        } 
        
        
            RequestDispatcher view = request.getRequestDispatcher(forward);
            view.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Contact contact = new Contact();
            Contact newContact = new Contact();        
            contact.setEmail(request.getParameter("email"));
            contact.setTelephone(request.getParameter("telephone")); 
            newContact=dalContact.addContact(contact);

            Address address = new Address();
            Address newAddress = new Address();          
            address.setCep(request.getParameter("cep"));
            address.setComplement(request.getParameter("complement"));
            address.setDistrict(request.getParameter("district"));
            address.setNumberAddress(Integer.parseInt(request.getParameter("numberAddress")));
            address.setLogradouro(request.getParameter("logradouro"));
            address.setCity(dalCity.getCityById(Integer.parseInt(request.getParameter("city"))));
            newAddress=dalAddress.addAddress(address);

            Client client = new Client();
            Client newClient= new Client();
            client.setContact(newContact);
            client.setAddress(newAddress);
            newClient=dalClient.addClient(client);

            ClientPf clientPf = new ClientPf();
            clientPf.setCpf(request.getParameter("cpf"));
            clientPf.setIdentity(request.getParameter("identity"));
            clientPf.setName(request.getParameter("name"));
            clientPf.setClient(newClient);
            dal.addClientPf(clientPf);   
                 
         
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("clientPfs", dal.getAllClientPf());
        view.forward(request, response);       
        
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
