
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transfer Page</title>
    </head>
    <body>
        <h3>Transfer</h3>
        <p>
            Enter recipient userId: 
        </p>
        <form action="TransferServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="rcId" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enter"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
