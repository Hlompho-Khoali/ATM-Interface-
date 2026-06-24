/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.servlets;

import atm.model.Bank;
import atm.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hlomp
 */
public class AuthUserServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        
        String userId = request.getParameter("userId");
        String pin = request.getParameter("pin");
        
        Bank bank = new Bank();
        
        
        User user = bank.authenticate(userId, pin);
        session.setAttribute("user", user);
        
        if (user != null) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("menu.jsp");
            dispatch.forward(request, response);
            
        } else {
            RequestDispatcher dispatch = request.getRequestDispatcher("invalid.html");
            dispatch.forward(request, response);
        }
    }

}
