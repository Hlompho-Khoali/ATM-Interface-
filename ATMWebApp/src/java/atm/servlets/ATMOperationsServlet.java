/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.servlets;

import atm.model.User;
import java.io.IOException;
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
public class ATMOperationsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        User user = (User)session.getAttribute("user");
        
        Integer choice = Integer.valueOf(request.getParameter("choice"));
        
        
        if(choice == 1){
            
            RequestDispatcher dispatch = request.getRequestDispatcher("transaction_page.jsp");
            dispatch.forward(request, response);
            
        } else if(choice == 2) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("withdraw_page.jsp");
            dispatch.forward(request, response);
            
        } else if(choice == 3) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("deposit_page.jsp");
            dispatch.forward(request, response);
            
                    
        } else if(choice == 4) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("transfer_page.jsp");
            dispatch.forward(request, response);
              
        } else if(choice == 5) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("view_balance.jsp");
            request.setAttribute("balance", user.getBalance());
            dispatch.forward(request, response);
            
            
        } else if(choice == 6) {
            
            RequestDispatcher dispatch = request.getRequestDispatcher("quit_page.jsp");
            dispatch.forward(request, response);
        }
    }

}
