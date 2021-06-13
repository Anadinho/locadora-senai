/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.locadora.bll;

import br.com.locadora.dal.AddressDal;
import br.com.locadora.dal.CategoryDal;
import br.com.locadora.dal.ModelDal;
import br.com.locadora.dal.SituationVehicleDal;
import br.com.locadora.dal.VehicleDal;
import br.com.locadora.dal.VehicleTypeDal;
import br.com.locadora.model.Category;
import br.com.locadora.model.Model;
import br.com.locadora.model.SituationVehicle;
import br.com.locadora.model.Vehicle;
import br.com.locadora.model.VehicleType;
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
@WebServlet(name = "VehicleController", urlPatterns = {"/VehicleController"})
public class VehicleController extends HttpServlet {
    
        private static String INSERT_OR_EDIT = "./veiculo/cadastrar.jsp";
    private static String EDIT = "/editarVehicle.jsp";
    private static String LIST_USER = "/listarVehicle.jsp";
    
    private VehicleDal dal;
    private ModelDal dalModel;
    private CategoryDal dalCategory;
    private VehicleTypeDal dalVehicleType;
    private SituationVehicleDal dalSituationVehicle;
    
        public VehicleController() {
        super();
        dal = new VehicleDal();
        dalModel= new ModelDal();
        dalCategory = new CategoryDal();
        dalVehicleType=new VehicleTypeDal();
        dalSituationVehicle= new SituationVehicleDal();
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
            out.println("<title>Servlet VehicleController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VehicleController at " + request.getContextPath() + "</h1>");
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
            if(action.equalsIgnoreCase("listarVehicle")){
                 forward = LIST_USER;
                 request.setAttribute("vehicles", dal.getAllVehicle());
                 
        }else  if(action.equalsIgnoreCase("cadastrarVehicle")){
             request.setAttribute("models", dalModel.getAllModel());
             request.setAttribute("categorys", dalCategory.getAllCategory());
             request.setAttribute("vehicleTypes", dalVehicleType.getAllVehicleType());
             request.setAttribute("situationVehicles", dalSituationVehicle.getAllSituationVehicle());
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
        Vehicle vehicle = new Vehicle();
        Vehicle newVehicle= new Vehicle();
        vehicle.setLicensePlate(request.getParameter("licensePlate"));
        vehicle.setModel(dalModel.getModelById(Integer.parseInt(request.getParameter("model"))));
        vehicle.setRenavam(Integer.parseInt(request.getParameter("renavam")));
        vehicle.setCategory(dalCategory.getCategoryById(Integer.parseInt(request.getParameter("category"))));
        vehicle.setBuyPrice(Double.parseDouble(request.getParameter("buyPrice")));
        vehicle.setSalePrice(Double.parseDouble(request.getParameter("salePrice")));
        vehicle.setNumberPassengers(Integer.parseInt(request.getParameter("numberPassengers")));
        vehicle.setYearFabrication(request.getParameter("yearFabrication"));
        vehicle.setYearModel(request.getParameter("yearModel"));
        vehicle.setTypeFuel(request.getParameter("typeFuel"));
        vehicle.setMileage(Integer.parseInt(request.getParameter("mileage")));
        vehicle.setVehicleType(dalVehicleType.getVehicleTypeById(Integer.parseInt(request.getParameter("vehicleType"))));
        vehicle.setSituationVehicle(dalSituationVehicle.getSituationVehicleById(Integer.parseInt(request.getParameter("situationVehicle"))));
        dal.addVehicle(vehicle);

        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("vehicles", dal.getAllVehicle());
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
