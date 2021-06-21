/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.bll;

import br.com.locadora.dal.AddressDal;
import br.com.locadora.dal.CityDal;
import br.com.locadora.dal.ClientPfDal;
import br.com.locadora.dal.ContactDal;
import br.com.locadora.dal.DriverDal;
import br.com.locadora.model.Address;
import br.com.locadora.model.ClientPf;
import br.com.locadora.model.Contact;
import br.com.locadora.model.Driver;
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
@WebServlet(name = "DriverController", urlPatterns = {"/DriverController"})
public class DriverController extends HttpServlet {
            private static String INSERT_OR_EDIT = "/cadastrarDriver.jsp";
    private static String EDIT = "/editarDriver.jsp";
    private static String LIST_USER = "/listarDriver.jsp";
    
    private DriverDal dal;
    private ContactDal dalContact;
    private AddressDal dalAddress;
    private CityDal dalCity;
    
        public DriverController() {
        super();
        dal = new DriverDal();
        dalContact=new ContactDal();
        dalAddress= new AddressDal();
        dalCity=new CityDal();
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
            out.println("<title>Servlet DriverController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DriverController at " + request.getContextPath() + "</h1>");
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
            if(action.equalsIgnoreCase("listarDriver")){
                request.setAttribute("drivers", dal.getAllDriver());
                forward = LIST_USER;
                 
        }else  if(action.equalsIgnoreCase("cadastrarDriver")){
             request.setAttribute("citys", dal.getAllCity());
             request.setAttribute("drives", dal.getAllDriver()); 
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
            
            Driver driver = new Driver();
            driver.setCpf(request.getParameter("cpf"));
            driver.setName(request.getParameter("name"));
            driver.setIdentity(request.getParameter("identity"));
            driver.setCnh(request.getParameter("cnh"));
            driver.setCategory(request.getParameter("category"));
            
            try {
            Date cnhValidity = new SimpleDateFormat("MM/dd/yyyy").parse(request.getParameter("cnhValidity"));
            driver.setCnhValidity(cnhValidity);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            
            driver.setUrlCnh(request.getParameter("urlCnh"));
            driver.setAddress(newAddress);
            driver.setContact(newContact);
            dal.addDriver(driver); 
        
        
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
