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
import br.com.locadora.dal.DriverDal;
import br.com.locadora.dal.RentalDal;
import br.com.locadora.dal.VehicleDal;
import br.com.locadora.model.Address;
import br.com.locadora.model.Rental;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class
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
@WebServlet(name = "RentalController", urlPatterns = {"/RentalController"})
public class RentalController extends HttpServlet {
    
//    private static String INSERT_OR_EDIT = "/cadastrarRental.jsp";
    private static String INSERT_OR_EDIT = "./locadora/cadastrar.jsp";
    private static String EDIT = "/editarRental.jsp";
    private static String LIST_USER = "./locadora/consultar.jsp";
    
    private RentalDal dal;
    private VehicleDal dalVehicle;
    private ClientDal dalClient;
    private DriverDal dalDriver;
    private ClientPfDal dalClientPf;
    private ClientPjDal dalClientPj;
  
        public RentalController() {
        super();
        dal = new RentalDal();
        dalVehicle=new VehicleDal();
        dalClient = new ClientDal();
        dalDriver= new DriverDal();
        dalClientPf= new ClientPfDal();
        dalClientPj= new ClientPjDal();
        
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
            out.println("<title>Servlet RentalController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RentalController at " + request.getContextPath() + "</h1>");
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
        if(action.equalsIgnoreCase("listarRental")){
                 forward = LIST_USER;
                 request.setAttribute("rentals", dal.getAllRental());
                 
        }else if(action.equalsIgnoreCase("listarRentalPj")){
                 forward = "./locadora/consultarPj.jsp";
                 request.setAttribute("rentals", dal.getAllRentalPj());
                 
        }
        else  if(action.equalsIgnoreCase("cadastrarRental")){
             
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver()); 
             forward = INSERT_OR_EDIT;             
             
        }else  if(action.equalsIgnoreCase("cadastrarRentalPj")){
             
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver()); 
             forward = "./locadora/cadastrarPj.jsp";
             
             
        }else  if(action.equalsIgnoreCase("simularRental")){     
                           
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver());           
             forward = "./locadora/simular.jsp";

        }else  if(action.equalsIgnoreCase("simularRentalPj")){     
                           
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver());           
             forward = "./locadora/simularPj.jsp";
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
            String forward="";
            String action = request.getParameter("action");
            
            if(action.equalsIgnoreCase("cadastrarRentalPf")){
        
            Rental rental = new Rental();
                     
            rental.setVehicle(dalVehicle.getVehicleById(request.getParameter("vehicle")));
            rental.setClient(dalClient.getClientById(Integer.parseInt(request.getParameter("fk_client"))));
            rental.setDriver(dalDriver.getDriverById(request.getParameter("driver")));
                     
            rental.setDiarias(Double.parseDouble(request.getParameter("diarias"))); 
            rental.setInitialMileage(Integer.parseInt(request.getParameter("initialMileage")));
//            rental.setFinalMileage(Integer.parseInt(request.getParameter("finalMileage")));  
            rental.setPriceRental(Double.parseDouble(request.getParameter("priceRental")));
            rental.setPriceGuarantee(Double.parseDouble(request.getParameter("priceGuarantee")));
            rental.setPriceInsuranceCar(Double.parseDouble(request.getParameter("priceInsuranceCar")));
            rental.setPriceInsuranceRental(Double.parseDouble(request.getParameter("priceInsuranceRental")));
            rental.setPriceTotal(Double.parseDouble(request.getParameter("priceTotal")));
            rental.setLateFee(request.getParameter("lateFee"));
            rental.setTrafficTicket(request.getParameter("trafficTicket"));            
//            rental.setLitersFuel(Integer.parseInt(request.getParameter("litersFuel")));
            dal.addRental(rental);
            
        
            RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
            request.setAttribute("rentals", dal.getAllRental());
            view.forward(request, response);
            
            }if(action.equalsIgnoreCase("cadastrarRentalPj")){
        
            Rental rental = new Rental();
                     
            rental.setVehicle(dalVehicle.getVehicleById(request.getParameter("vehicle")));
            rental.setClient(dalClient.getClientById(Integer.parseInt(request.getParameter("fk_client"))));
            rental.setDriver(dalDriver.getDriverById(request.getParameter("driver")));
                     
            rental.setDiarias(Double.parseDouble(request.getParameter("diarias"))); 
            rental.setInitialMileage(Integer.parseInt(request.getParameter("initialMileage")));
//            rental.setFinalMileage(Integer.parseInt(request.getParameter("finalMileage")));  
            rental.setPriceRental(Double.parseDouble(request.getParameter("priceRental")));
            rental.setPriceGuarantee(Double.parseDouble(request.getParameter("priceGuarantee")));
            rental.setPriceInsuranceCar(Double.parseDouble(request.getParameter("priceInsuranceCar")));
            rental.setPriceInsuranceRental(Double.parseDouble(request.getParameter("priceInsuranceRental")));
            rental.setPriceTotal(Double.parseDouble(request.getParameter("priceTotal")));
            rental.setLateFee(request.getParameter("lateFee"));
            rental.setTrafficTicket(request.getParameter("trafficTicket"));            
//            rental.setLitersFuel(Integer.parseInt(request.getParameter("litersFuel")));
            dal.addRental(rental);
            
        
            RequestDispatcher view = request.getRequestDispatcher("./locadora/consultarPj.jsp");
            request.setAttribute("rentals", dal.getAllRentalPj());
            view.forward(request, response);
            
            }
            
            
            
             else if(action.equalsIgnoreCase("simularRental")){
             Rental rental = new Rental();
             
             
             rental.setInitialMileage(dalVehicle.getVehicleById(request.getParameter("vehicle")).getMileage());
             rental.setDiarias(Double.parseDouble(request.getParameter("diarias")));             
             rental.setValorDiaria(dalVehicle.getVehicleById(request.getParameter("vehicle")).getCategory().getValor());
             rental.setCalculoTotal(Double.parseDouble(request.getParameter("diarias")), dalVehicle.getVehicleById(request.getParameter("vehicle")).getCategory().getValor());
             rental.setCalculoCaucao(rental.getCalculoTotal());
             rental.setPriceInsuranceCar(100000);
             rental.setValorSeguroLocacao(rental.getCalculoTotal());
             rental.setCalculoTotalLocacao(rental.getCalculoTotal(), rental.getPriceInsuranceRental());
             request.setAttribute("simuladoRental", rental); 
             
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver()); 
             RequestDispatcher view = request.getRequestDispatcher(INSERT_OR_EDIT);             
             view.forward(request, response);
                
        } else if(action.equalsIgnoreCase("simularRentalPj")){
             Rental rental = new Rental();
             
             
             rental.setInitialMileage(dalVehicle.getVehicleById(request.getParameter("vehicle")).getMileage());
             rental.setDiarias(Double.parseDouble(request.getParameter("diarias")));             
             rental.setValorDiaria(dalVehicle.getVehicleById(request.getParameter("vehicle")).getCategory().getValor());
             rental.setCalculoTotal(Double.parseDouble(request.getParameter("diarias")), dalVehicle.getVehicleById(request.getParameter("vehicle")).getCategory().getValor());
             rental.setCalculoCaucao(rental.getCalculoTotal());
             rental.setPriceInsuranceCar(100000);
             rental.setValorSeguroLocacao(rental.getCalculoTotal());
             rental.setCalculoTotalLocacao(rental.getCalculoTotal(), rental.getPriceInsuranceRental());
             request.setAttribute("simuladoRental", rental); 
             
             request.setAttribute("clientPjs", dalClientPj.getAllClientPj());
             request.setAttribute("clientPfs", dalClientPf.getAllClientPf()); 
             request.setAttribute("vehicles", dalVehicle.getAllVehicle()); 
             request.setAttribute("drivers", dalDriver.getAllDriver()); 
             RequestDispatcher view = request.getRequestDispatcher("./locadora/cadastrarPj.jsp");             
             view.forward(request, response);
                
        }
            
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
