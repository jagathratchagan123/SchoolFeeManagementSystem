School Fee Management (Java + MySQL)

A  beginner‑friendly CRUD project to manage school fees using plain Java (JDBC) and MySQL. 

- Add a student with fee info
- View students and their fee status
- Update a student’s fee details
- Delete a student when needed

 Tech stack
- Language: Java 
- Database: MySQL 8
- Driver: MySQL Connector/J (JDBC)

Prerequisites
- Java installed (check with `java -version`)
- MySQL running locally (remember your username/password)
- Download the MySQL JDBC driver (`mysql-connector-j-x.y.z.jar`)

1) Create the database and table
-sql
CREATE DATABASE IF NOT EXISTS school_fee_db;
USE school_fee_db;

CREATE TABLE  students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  grade VARCHAR(20) NOT NULL,
  total_fee DECIMAL(10,2) NOT NULL,
  paid_amount DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

