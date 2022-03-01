
package cotroller;

import dal.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Customer;


public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CustomerDAO cd = new CustomerDAO();
        String u = request.getParameter("user");
        String p = request.getParameter("pass");
        Customer ad = cd.check(u, p);
        
        if(ad == null){
            request.setAttribute("error", "Incorrect account or password information");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
        else{
            HttpSession session = request.getSession(true);
            if(u.equals("mepheshop") && p.equals("Mepheshop20092001@")){
                session.setAttribute("account", ad);
                request.getRequestDispatcher("shop").forward(request, response);
            }
            else{
            session.setAttribute("account", ad);
            request.getRequestDispatcher("list").forward(request, response);
            }
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
