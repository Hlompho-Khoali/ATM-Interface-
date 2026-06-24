
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Recipient Transfer Page</title>
    </head>
    <body>
        <h3>Recipient Transfer</h3>
        <p>
            Enter amount to transfer:
        </p>
        <form action="RecipientTransferServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="amount" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Transfer" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
