# DecodeLabs Java Project - ATM Interface 

## Overview
This is a console-based ATM Simulation System developed using Java.  
It simulates real-world ATM operations like card insertion and removal, PIN authentication, deposit, withdrawal, and balance enquiry using the **State Design Pattern**.

## Internship Details
This project was developed as part of a **Virtual Internship Program in Java Programming** at **DecodeLabs**.  
It was **Project 3**, which focus concepts like Classes & objects, methods, encapsulation, input validation

---

## Features
- Insert ATM card simulation
- PIN authentication
- Deposit money
- Withdraw money
- Check balance
- Remove card functionality
- State-based workflow (Idle → Has Card → Authenticated)

---

## Project Structure

```
ATMProject/
|
|--- ATMState.java
|--- ATM.java
|--- BankAccount.java
|--- IdleState.java
|--- HasState.java
|--- AuthenticatedState.java
|--- ATMDemo.java
```

## File Description

- **ATMState.java** -> Interface defining all ATM operations (state methods)
- **ATM.java** -> Controls current state and handles state transitions
- **BankAccount.java** -> Stores account details and handles deposit,withdraw logic
  A **sample account is predefined in ATMDemo.java** with:
  - Account Number: ACC1001  
  - PIN: 1234  
  - Initial Balance: 1000
- **IdleState.java** -> Initial state (no card inserted)
- **HasState.java** -> After card insertion and before PIN authentication
- **AuthenticatedState.java** -> After successful PIN entry, allows transactions
- **ATMDemo.java** -> Main class (entry point with menu-driven program)

---

## States + Working

1. User starts program (ATMDemo)
2. ATM starts in IdleState
4. Insert card -> system moves to **HasState**
   - PIN entry allowed
   - Other operations are blocked
5. Enter correct PIN -> moves to **AuthenticatedState**
   - Deposit allowed
   - Withdraw allowed
   - Check balance allowed
6. Perform transactions:
   - Deposit
   - Withdraw
   - Checks balance
7. Remove Card -> returns to IdleState

---

## How to Run

1. Place all `.java` files in the same folder
2. Open terminal in that folder
3. Compile all files
   ```
   javac *.java
   ```
5. Run the program  
   ```
   java ATMDemo
   ```
