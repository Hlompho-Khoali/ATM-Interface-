/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.servlets;

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
public class WithdrawServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");
        
        Double amount = Double.valueOf(request.getParameter("amount"));
        
        if (user.withdraw(amount)) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("withdraw_success_page.jsp");
            dispatch.forward(request, response);
            
        } else {
            RequestDispatcher dispatch = request.getRequestDispatcher("withdraw_failure_page.jsp");
            dispatch.forward(request, response);
            
        }
    }

}
