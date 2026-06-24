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
public class TransferServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String rcId = request.getParameter("rcId");
        
        Bank bank = new Bank();
        
        User user = (User)session.getAttribute("user");
        
        User recipient = bank.getUser(rcId);
        
        session.setAttribute("recipient", recipient);
        session.setAttribute("rcId", rcId);
        
        if (recipient == null) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("recipient_not_found_page.jsp");
            dispatch.forward(request, response);
            
        }
        RequestDispatcher dispatch = request.getRequestDispatcher("recipient_transfer_page.jsp");
        dispatch.forward(request, response);
        
        
    }

}
