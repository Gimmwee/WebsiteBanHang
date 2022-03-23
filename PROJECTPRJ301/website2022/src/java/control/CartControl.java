/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO;
import dao.OrdersDAO;
import dao.OrdersDetailDAO;
import entity.Customer;
import entity.Orders;
import entity.OrdersDetail;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Son
 */
@WebServlet(name = "CartControl", urlPatterns = {"/cart"})
public class CartControl extends HttpServlet {

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
            throws ServletException, IOException, SQLException, Exception {
        response.setContentType("text/html;charset=UTF-8");

        String productID = request.getParameter("productID");
        String quantity = request.getParameter("quantity");
        Customer currentAccount = (Customer) request.getSession().getAttribute("cuss");
        boolean creatAnOderProduct = false;

        if (currentAccount != null) {
            Orders customerOrder = OrdersDAO.isHaveOrder(currentAccount.getUser());
//            System.out.println(customerOrder);
            // Chưa có thì tạo order mới
            if (customerOrder == null) {
                boolean createOrderMess = OrdersDAO.addToCart(currentAccount.getUser());
                customerOrder = OrdersDAO.isHaveOrder(currentAccount.getUser());
                if (productID != null && quantity != null) {
                    creatAnOderProduct = OrdersDetailDAO.createAnOrderDetailProduct(customerOrder.getOrderID(), Integer.parseInt(productID), Integer.parseInt(quantity));
                }
            } else if (productID != null && quantity != null) {
//                nếu có order sẵn (isPay = 0) -->add thêm sp (crateSP)
                creatAnOderProduct = OrdersDetailDAO.createAnOrderDetailProduct(customerOrder.getOrderID(), Integer.parseInt(productID), Integer.parseInt(quantity));
            }
            request.getRequestDispatcher("show").forward(request, response);
        } else {
            request.getRequestDispatcher("login").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(CartControl.class.getName()).log(Level.SEVERE, null, ex);
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
