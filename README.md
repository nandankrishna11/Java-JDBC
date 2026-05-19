# JDBC Employee DB Project

A simple Java console application demonstrating basic CRUD operations on an `employee` table using PostgreSQL and JDBC.

## Project Structure

- `pom.xml` - Maven project configuration.
- `src/main/java/employeeManagement1/CrudOperations.java` - Main application with menu-driven create/read/update/delete operations.
- `src/main/java/employeeManagement1/DBConnection.java` - PostgreSQL JDBC connection helper.
- `src/main/java/employeeManagement1/Employee.java` - Employee model class.
- `src/main/java/employeeManagement1/InvalidChoiceException.java` - Custom exception for invalid menu input.

## Prerequisites

- Java 21 or later
- Maven
- PostgreSQL database

## Database Setup

The application currently connects to PostgreSQL using the following settings in `DBConnection.java`:

- URL: `jdbc:postgresql://localhost:5432/empdetails`
- Username: `postgres`
- Password: `1234`

Create a database and an `employee` table before running the app, for example:

```sql
CREATE DATABASE empdetails;
\c empdetails

CREATE TABLE employee (
  empid INT PRIMARY KEY,
  name VARCHAR(100),
  salary NUMERIC,
  phno VARCHAR(20),
  email VARCHAR(100),
  address VARCHAR(255),
  company VARCHAR(100)
);
```

If your PostgreSQL credentials or database name differ, update `DBConnection.java` accordingly.

## Build and Run

From the project root:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="employeeManagement1.CrudOperations"
```

If you do not have the Maven Exec Plugin configured, you can also run the app by building a JAR and using `java -cp`.

## Usage

Run the application and enter a menu number to perform one of the following actions:

1. Save a new employee
2. Update an existing employee
3. Delete an employee
4. Fetch all employees
5. Fetch employee by ID
6. Exit

## Notes

- This project uses plain JDBC and simple SQL statements for demonstration.
- Handle database credentials securely in production instead of hard-coding them.
