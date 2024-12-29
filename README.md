Project Overview: User Management and Calculator System

This project consists of two main components, implemented as separate classes: Account2Class and Calculator. The project provides a comprehensive user account management system and a fully functional calculator with extended capabilities. Below is an overview of the features and functionalities:

Account2Class: User Account Management System

The Account2Class is designed to manage user accounts effectively. It includes the following key functionalities:

Features:
	1.	Sign-Up System:
	•	Allows users to create an account by providing a username and password.
	•	Includes a password confirmation step to ensure consistency.
	2.	Login System:
	•	Validates user credentials to grant access.
	•	Displays the last login timestamp upon successful authentication.
	3.	Password Management:
	•	Forget Password: Enables users to reset their password if they forget it by verifying their username.
	•	Reset Password: Allows users to change their password after confirming their current password.
	4.	Account Deletion:
	•	Offers the option to delete an account with a confirmation step.
	5.	Security Features:
	•	Prevents unauthorized access by validating user credentials.
	•	Stores the last login time to track user activity.

Calculator: Arithmetic Operations and Expression Evaluation

The Calculator class is a menu-driven application that provides essential arithmetic operations and expression evaluation.

Features:
	1.	Arithmetic Operations:
	•	Addition: Adds two numbers.
	•	Subtraction: Subtracts the second number from the first.
	•	Multiplication: Multiplies two numbers.
	•	Division: Divides the first number by the second, with error handling for division by zero.
	2.	Expression Evaluation:
	•	Evaluates mathematical expressions of the form a + b * c.
	3.	User Interaction:
	•	Provides a clear and interactive menu for users to choose operations.
	•	Continuously accepts user input until the user selects the exit option.
	4.	Error Handling:
	•	Handles invalid input gracefully.
	•	Prevents division by zero.
	5.	Extensible Design:
	•	Modular structure allows for the addition of new operations with minimal effort.

Implementation Details
	•	Programming Language: Java
	•	Input/Output: Uses the Scanner class for user input and console output for interaction.
	•	Date and Time: Leverages LocalDateTime to track login activity.
	•	Modular Design: Both classes are independent, making the codebase maintainable and scalable.

Example Use Cases:
	1.	User Management:
	•	A user can create an account, log in, and manage their credentials securely.
	2.	Calculator:
	•	Perform quick calculations or evaluate complex mathematical expressions.

How to Use
	1.	Run the program and follow the on-screen instructions.
	2.	Use the account system to create and manage user profiles.
	3.	Access the calculator to perform desired arithmetic operations.

This project showcases fundamental object-oriented programming principles and highlights the seamless integration of user account management and mathematical computation functionalities. It is an excellent starting point for developing more advanced applications with enhanced security and features.