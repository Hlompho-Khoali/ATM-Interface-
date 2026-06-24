
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h3>Menu</h3>
        <p>
            1. Transaction History<br>
            2. Withdraw<br>
            3. Deposit<br>
            4. Transfer<br>
            5. View Balance<br>
            6. Quit<br>
        </p>
        <form action="ATMOperationsServlet.do" method="post">
            <table>
                <tr>
                    <td></td>
                    <td><input type="text" name="choice" required=""/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Enter"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
