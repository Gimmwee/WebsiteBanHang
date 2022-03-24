package control;

import dao.DAO;
import dao.PagingDAO;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Son
 */
@WebServlet(name = "ManagerControl", urlPatterns = {"/manager"})
public class ManagerControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            DAO dao = new DAO();
            PagingDAO pag = new PagingDAO();
            List<Product> list1 = dao.getAllProduct();
            List<Category> listC = dao.getAllCategory();

            int page, numperpage = 5;                     //page là cái trang nào và bnh phần từ/1page
            int size = list1.size();
            int num = (size % 5 == 0 ? (size / 5) : ((size / 5)) + 1); // neu ma chia het size/8 : size/8+1 để biết đc có bnh trang ( số trang ) 
            String xpage = request.getParameter("page");

            if (xpage == null) {              //khi mà xpage chưa có thì để = 1
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }

            int start, end;
            start = (page - 1) * numperpage; // ở trang nào 
            end = Math.min(page * numperpage, size); // ko lấy giá trị bằng 

            List<Product> list = pag.getListByPage(list1, start, end);

            request.setAttribute("listP", list);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
            request.setAttribute("listC", listC);
            request.getRequestDispatcher("Manager.jsp").forward(request, response);
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
        processRequest(request, response);
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
