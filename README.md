Overview

The School Fee Management System is a Java console application designed to help educational institutions efficiently manage student fee records and payments. It interacts with a MySQL database to store and retrieve student fee data, ensuring that all financial transactions related to student fees are recorded accurately and transparently.

Purpose

Managing student fees manually can be time-consuming and prone to errors, especially in schools with many students. This system automates the following tasks:

Adding new students and recording their total fees

Recording fee payments made by students

Viewing detailed information about each student’s fee payment status

Generating summary reports for administrative review

By automating these tasks, the system reduces manual errors, saves time, and helps school administrators keep clear records of fee collections and outstanding balances.

Functionalities

Add Student
Allows the admin to register a new student by entering their name and the total fee amount.

Automatically initializes the amount paid by the student to zero.

Stores the student data in the database.

Make Payment
Enables the admin to enter a payment amount for a specific student by providing their student ID.

Updates the student’s paid fee amount in the database by adding the new payment.

Supports multiple payments over time until the full fee is paid.

View All Students
Lists all students currently stored in the database.

Displays each student’s ID, name, total fee, amount paid, and balance due (total fee minus paid fee).

Helps administrators quickly check payment statuses.

Generate Report
Provides a summary report showing:

Total number of students

Total fees expected from all students combined

Total fees collected so far

Total balance outstanding (fees yet to be paid)

Technical Design

Database Layer

The program connects to a MySQL database named school containing a table students with columns for student ID, name, total fee, and paid fee.

SQL queries are used to perform insert, update, and select operations on student records.

Java Application Layer

DB Class: Handles database connection details and provides a method to get a connection object.

StudentDAO Class: Contains static methods to:

Add students (addStudent)

Update payments (makePayment)

Retrieve and display student data (viewAll)

Generate fee summary reports (report)

Main Class (SchoolFeeManager): Implements a console-based menu interface that interacts with the user and calls appropriate methods from StudentDAO.

Object-Oriented Principles

Encapsulation: The database logic and student-related operations are encapsulated inside dedicated classes (DB and StudentDAO), keeping related functionality organized and separate from the user interface.

Abstraction: Complex SQL operations are hidden behind simple method calls, making it easier to manage and update the code.

User Interaction

When the program starts, the user is presented with a menu:

Add a student

Make a payment

View all students

View a report

Exit the program

The user selects an option by entering the corresponding number.

The program prompts for the necessary input based on the selected action.

After completing the requested action, the menu is displayed again until the user chooses to exit.
