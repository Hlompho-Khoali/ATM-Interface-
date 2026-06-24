
<%@page import="atm.model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipient Transfer Success Page</title>
    </head>
    <body>
        <%
            User user = (User)session.getAttribute("user");
            
        %>
        <h3>Recipient Transfer Successful</h3>
        <p>
            Transfer successful. Balance: R + <%=user.getBalance()%>
        </p>
        <a href="menu.jsp">Menu Page</a>
    </body>
</html>
