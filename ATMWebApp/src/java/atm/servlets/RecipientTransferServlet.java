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
public class RecipientTransferServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");
        
        Double amount = Double.valueOf(request.getParameter("amount"));
        
        User recipient = (User)session.getAttribute("recipient");
        String rcId = (String)session.getAttribute("rcId");
        
        session.setAttribute("amount", amount);
        
        if (user.withdraw(amount)) {
            recipient.deposit(amount);
            
            RequestDispatcher dispatch = request.getRequestDispatcher("recipient_transfer_success_page.jsp");
            dispatch.forward(request, response);
            
            user.addTransaction("Transfer to " + rcId, amount);
            recipient.addTransaction("Transfer from " + user.getUserId(), amount);
        } else {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("recipient_transfer_failure_page.jsp");
            dispatch.forward(request, response);
        }
    }

}
