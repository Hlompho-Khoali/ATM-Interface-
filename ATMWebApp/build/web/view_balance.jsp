
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Balance Page</title>
    </head>
    <body>
        <h3>Current Balance</h3>
        <p>
            Balance: R <%= request.getAttribute("balance") %>
        </p>
        <a href="menu.jsp">Back to Menu</a>
    </body>
</html>
