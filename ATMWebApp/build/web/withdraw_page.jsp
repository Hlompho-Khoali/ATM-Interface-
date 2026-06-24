
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Withdraw Page</title>
    </head>
    <body>
        <h3>Withdrawal</h3>
        <p>
            Enter amount to withdraw:
        </p>
        <form action="WithdrawServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="amount" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Withdraw" /></td>
                </tr>
            </table>
        </form>
    </body>
</html>
