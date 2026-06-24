
<%@page import="java.util.List"%>
<%@page import="atm.model.Transaction"%>
<%@page import="atm.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction Page</title>
    </head>
    <body>
        
        <%
            User user = (User)session.getAttribute("user");
            List<Transaction> transactions = user.showHistory();
            String message = "";
            
            if(transactions.isEmpty()) {
                message = "No transactions yet";
            }
        %>
        <h3>Transaction Page</h3>
        <p>
            <%=message%><br>
            <%=transactions%>
        </p>
        <a href="menu.jsp">Menu Page</a>
    </body>
</html>
