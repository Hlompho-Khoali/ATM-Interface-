# ATM Web Application (Java EE)

## Overview
This project is a web-based ATM system built using Java EE (Servlets + JSP + Models).  
It simulates basic ATM functionalities such as viewing transaction history, deposits, withdrawals, transfers, and balance inquiries.  

The application was originally developed as a console-based Java program and later migrated to a web application using GlassFish/Payara.

---

## Features
- User login with session management
- Deposit and withdraw funds with balance validation
- Transfer funds between users
- Transaction history tracking
- View current balance
- JSP-based user interface with servlets handling business logic


---

## Technologies Used
- Java EE (Servlets, JSP)
- GlassFish / Payara Server
- VS Code IDE (development environment)
- HTML & JSP for front-end pages


---

## Project Files
### Model Layer (`atm.model`)
- `User.java` → Manages user details, balance, and transaction history.  
- `Transaction.java` → Represents individual transactions with type, amount, and date.

### Servlet Layer (`atm.servlets`)
- `LoginServlet.java` / `AuthUserServlet.java` → Handles user authentication.  
- `ATMOperationsServlet.java` → Routes menu choices (history, deposit, withdraw, transfer, balance, quit).  
- `DepositServlet.java` → Handles deposits.  
- `WithdrawServlet.java` → Handles withdrawals.  
- `TransferServlet.java` → Initiates transfer by recipient ID.  
- `RecipientTransferServlet.java` → Completes transfer to recipient.  
- `ViewBalanceServlet.java` → Displays current balance.  
- `LogoutServlet.java` → Ends session.

### Web Layer (`web/`)
- `login.jsp` → Login form.  
- `invalid_credentials.jsp` → Error page for failed login.  
- `menu.jsp` → Main ATM menu.  
- `transaction_page.jsp` → Transaction history.  
- `deposit.jsp`, `deposit_success.jsp` → Deposit flow.  
- `withdraw.jsp`, `withdraw_success.jsp`, `withdraw_failure.jsp` → Withdrawal flow.  
- `transfer.jsp`, `recipient_transfer.jsp`, `recipient_transfer_success.jsp`, `recipient_transfer_failure.jsp`, `recipient_not_found.jsp` → Transfer flow.  
- `view_balance.jsp` → Balance inquiry.  
- `quit.jsp` → Exit page.



---

## Running the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/Hlompho-Khoali/ATM-Interface-.git

2. Open the project in NetBeans IDE
3. Deploy the project on GlassFish/Payara server.
4. Use the predefined users to log in:
   User 1 → User ID: 1234, PIN: 1111
   User 2 → User ID: 5678, PIN: 2222
