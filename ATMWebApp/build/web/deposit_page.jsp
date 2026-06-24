
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deposit Page</title>
    </head>
    <body>
        <h3>Deposit</h3>
        <p>
            Enter amount to deposit:
        </p>
        <form action="DepositServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="deposit" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Deposit" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
