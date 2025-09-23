## School Fee Management (Java + MySQL)

A tiny, beginner‑friendly CRUD project to manage school fees using plain Java (JDBC) and MySQL. We’ll keep it simple, human, and focused: create, read, update, delete — that’s it.

### What you can do
- **Add** a student with fee info
- **View** students and their fee status
- **Update** a student’s fee details
- **Delete** a student when needed

### Tech stack
- **Language**: Java (JDK 17+ recommended)
- **Database**: MySQL 8+
- **Driver**: MySQL Connector/J (JDBC)

### Prerequisites
- Java installed (check with `java -version`)
- MySQL running locally (remember your username/password)
- Download the MySQL JDBC driver (`mysql-connector-j-x.y.z.jar`)

### Quick start (Windows / PowerShell)
Create the database and table
CREATE DATABASE IF NOT EXISTS school_fee_db;
USE school_fee_db;

CREATE TABLE IF NOT EXISTS students (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  grade VARCHAR(20) NOT NULL,
  total_fee DECIMAL(10,2) NOT NULL,
  paid_amount DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);


