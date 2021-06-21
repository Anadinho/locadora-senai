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
import br.com.locadora.dal.ClientPjDal;
import br.com.locadora.dal.ContactDal;
import br.com.locadora.model.Address;
import br.com.locadora.model.Client;
import br.com.locadora.model.ClientPf;
import br.com.locadora.model.ClientPj;
import br.com.locadora.model.Contact;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ClientPjController", urlPatterns = {"/ClientPjController"})
public class ClientPjController extends HttpServlet {
        private static String INSERT_OR_EDIT = "./cliente/cadastrarPJ.jsp";
    private static String EDIT = "/editarClientPj.jsp";
    private static String LIST_USER = "./cliente/consultarPJ.jsp";
    
    private ClientPjDal dal;
    private ContactDal dalContact;
    private AddressDal dalAddress;
    private CityDal dalCity;
    private ClientDal dalClient;
    
        public ClientPjController() {
        super();
        dal = new ClientPjDal();
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
            out.println("<title>Servlet ClientPjController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClientPjController at " + request.getContextPath() + "</h1>");
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
            if(action.equalsIgnoreCase("listarClientPj")){
             request.setAttribute("clientPjs", dal.getAllClientPj());
             
             forward = LIST_USER;
                 
        } else  if(action.equalsIgnoreCase("cadastrarClientPj")){
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
            
            ClientPj clientPj = new ClientPj();
            clientPj.setCnpj(request.getParameter("cnpj"));
            clientPj.setFantasyName(request.getParameter("fantasyName"));
            clientPj.setRazaoSocial(request.getParameter("razaoSocial"));
            clientPj.setClient(newClient);
            dal.addClientPj(clientPj);
            
            RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
            request.setAttribute("clientPjs", dal.getAllClientPj());
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
