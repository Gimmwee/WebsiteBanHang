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
@WebServlet(name = "ShowCartControl", urlPatterns = {"/show"})
public class ShowCartControl extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        Customer currentAccount = (Customer) request.getSession().getAttribute("cuss");

        ArrayList<OrdersDetail> listOrderDetail = new ArrayList<>();
        ArrayList<Orders> listConfirmOrder = new ArrayList<>();
        DAO dao = new DAO();
        List<Product> listProduct = dao.getAllProduct();

        if (currentAccount != null) {
            Orders customerOrder = OrdersDAO.isHaveOrder(currentAccount.getUser());
            if (customerOrder != null) {
                listOrderDetail = OrdersDetailDAO.getListOrderProduct(customerOrder.getOrderID());
            }
            request.setAttribute("listProduct", listProduct);
            request.setAttribute("listOrderDetail", listOrderDetail);

//          Hiển thị list order đã thanh toán
            listConfirmOrder = OrdersDAO.getListConfirmOrder(currentAccount.getUser());
            if (!listConfirmOrder.isEmpty()) {
                for (int i = 0; i < listConfirmOrder.size(); i++) {
                    ArrayList<OrdersDetail> listOrderProductForConfirmOrder = OrdersDetailDAO.getListOrderProduct(listConfirmOrder.get(i).getOrderID());
                    listConfirmOrder.get(i).setListCustomerOrderProduct(listOrderProductForConfirmOrder);
                }
            }
            request.setAttribute("listConfirmOrder", listConfirmOrder);
            request.getRequestDispatcher("Cart.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login").forward(request, response);
        }

//        Cookie arr[] = request.getCookies();
//        PrintWriter out = response.getWriter();
//        List<Product> list = new ArrayList<>();
//        DAO dao = new DAO();
//        for (Cookie o : arr) {
//            if (o.getName().equals("id")) {
//                String txt[] = o.getValue().split(",");
//                for (String s : txt) {
//                    list.add(dao.getProduct(s));
//                }
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            int count = 1;
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).getId() == list.get(j).getId()) {
//                    count++;
//                    list.remove(j);
//                    j--;
//                    list.get(i).setAmount(count);
//                }
//            }
//        }
//        double total = 0;
//        for (Product o : list) {
//            total = total + o.getAmount() * o.getPrice();
//        }
//        request.setAttribute("list", list);
//        request.setAttribute("total", total);
//        request.setAttribute("vat", 0.1 * total);
//        request.setAttribute("sum", 1.1 * total);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
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
            Logger.getLogger(ShowCartControl.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ShowCartControl.class.getName()).log(Level.SEVERE, null, ex);
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
