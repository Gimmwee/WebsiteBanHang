package control;

import dao.CustomerDAO;
import entity.Customer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Son
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cooky : cookies) {
                if (cooky.getName().equals("username")) {
                    System.out.println(cooky.getValue());
                    request.setAttribute("username", cooky.getValue());
                }
                if (cooky.getName().equals("password")) {
                    System.out.println(cooky.getValue());
                    request.setAttribute("password", cooky.getValue());
                }
            }
        }
        request.getRequestDispatcher("Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String u = request.getParameter("user");
        String p = request.getParameter("pass");
        String remember = request.getParameter("check");

        System.out.println(u + " | " + p + " | " + remember);

        CustomerDAO cusDao = new CustomerDAO();

        Customer cus = cusDao.login(u, p);

        if (cus != null) {
            Cookie c_user = new Cookie("username", u);//luu account len tren cookie
            Cookie c_pass = new Cookie("password", p);
            if (remember != null) {
                c_user.setMaxAge(60 * 60 * 24 * 24);
                c_pass.setMaxAge(60 * 60 * 24 * 24);
            } else {
                c_user.setMaxAge(0);
                c_pass.setMaxAge(0);
            }
            response.addCookie(c_user); // luu user n pass len trinh duyet
            response.addCookie(c_pass);

            HttpSession session = request.getSession();

            session.setAttribute("cuss", cus);
            response.sendRedirect("home");

        } else {
            request.setAttribute("mess", "Wrong Username or Password!");
            request.getRequestDispatcher("Login.jsp").forward(request, response);

        }

    }
}
