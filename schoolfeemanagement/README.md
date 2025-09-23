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
1) Create the database and table

```sql
-- Run this in MySQL (e.g., MySQL Workbench or mysql CLI)
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
```

2) Project code (coming next)
- We’ll add simple Java classes that use JDBC to connect to MySQL and perform CRUD on the `students` table.
- We’ll keep configuration (DB URL, user, password) outside code for safety and ease.

3) How you’ll run it (once code is added)
- Place the MySQL driver JAR on the classpath
- Compile and run from PowerShell (example):

```bash
# Example only — paths will be adjusted once code exists
$env:CP = ".;lib\\mysql-connector-j-x.y.z.jar"
javac -cp $env:CP -d out src\\**\\*.java
java -cp "out;$env:CP" com.example.schoolfee.Main
```

### Data model (simple and clear)
- **students**
  - `id`: auto-increment identifier
  - `name`: student name
  - `grade`: class/grade (e.g., "Grade 10")
  - `total_fee`: expected total fee
  - `paid_amount`: how much has been paid so far

This single table is enough to demonstrate CRUD cleanly. If we need payments history later, we can add a `payments` table.

### Project philosophy
- Keep it minimal, readable, and friendly
- No frameworks at first — just Java + JDBC
- Small steps, working code, then iterate

### What’s next
- Add the Java source files (`src/`)
- Add a tiny `Main` menu to trigger CRUD from the console
- Add a simple config file for DB credentials

### Troubleshooting
- Cannot connect to DB? Check:
  - MySQL is running and listening on the expected port (default 3306)
  - Your user has rights to `school_fee_db`
  - The JDBC URL matches your setup, e.g. `jdbc:mysql://localhost:3306/school_fee_db`
- Classpath errors? Make sure the MySQL Connector/J JAR is included when compiling/running.

### License
MIT — free to use, learn, and adapt.


