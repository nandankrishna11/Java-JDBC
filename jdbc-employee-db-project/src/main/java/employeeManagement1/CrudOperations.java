package employeeManagement1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CrudOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Employee Database Project =====");

            System.out.println("1.Save");
            System.out.println("2.Update");
            System.out.println("3.Delete");
            System.out.println("4.FetchAll");
            System.out.println("5.FetchByID");
            System.out.println("6.Exit");

            System.out.println("Enter choice:");

            int choice = scanner.nextInt();

            try {

                switch (choice) {

                    // ===================================
                    // SAVE
                    // ===================================

                    case 1:

                        System.out.println("Enter Employee ID:");
                        int id = scanner.nextInt();

                        scanner.nextLine();

                        System.out.println("Enter Name:");
                        String name = scanner.nextLine();

                        System.out.println("Enter Salary:");
                        double salary = scanner.nextDouble();

                        scanner.nextLine();

                        System.out.println("Enter Phone:");
                        String phno = scanner.nextLine();

                        System.out.println("Enter Email:");
                        String email = scanner.nextLine();

                        System.out.println("Enter Address:");
                        String address = scanner.nextLine();

                        System.out.println("Enter Company Name:");
                        String company = scanner.nextLine();

                        Connection conn1 =
                                DBConnection.getConnection();

                        Statement stmt1 =
                                conn1.createStatement();

                        String query1 =
                                "INSERT INTO employee VALUES("
                                        + id + ","
                                        + "'" + name + "',"
                                        + salary + ","
                                        + "'" + phno + "',"
                                        + "'" + email + "',"
                                        + "'" + address + "',"
                                        + "'" + company + "')";

                        stmt1.executeUpdate(query1);

                        System.out.println(
                                "Employee Added Successfully"
                        );

                        conn1.close();

                        break;

                    // ===================================
                    // UPDATE
                    // ===================================

                    case 2:

                        System.out.println(
                                "a.Update Name"
                        );

                        System.out.println(
                                "b.Update Salary"
                        );

                        System.out.println(
                                "c.Update Phone"
                        );

                        System.out.println(
                                "d.Update Email"
                        );

                        char choice2 =
                                scanner.next().charAt(0);

                        scanner.nextLine();

                        System.out.println(
                                "Enter Employee ID:"
                        );

                        int updateId =
                                scanner.nextInt();

                        scanner.nextLine();

                        Connection conn2 =
                                DBConnection.getConnection();

                        Statement stmt2 =
                                conn2.createStatement();

                        switch (choice2) {

                            case 'a':

                                System.out.println(
                                        "Enter New Name:"
                                );

                                String newName =
                                        scanner.nextLine();

                                stmt2.executeUpdate(
                                        "UPDATE employee SET name='"
                                                + newName
                                                + "' WHERE empid="
                                                + updateId
                                );

                                System.out.println(
                                        "Name Updated"
                                );

                                break;

                            case 'b':

                                System.out.println(
                                        "Enter New Salary:"
                                );

                                double newSalary =
                                        scanner.nextDouble();

                                stmt2.executeUpdate(
                                        "UPDATE employee SET salary="
                                                + newSalary
                                                + " WHERE empid="
                                                + updateId
                                );

                                System.out.println(
                                        "Salary Updated"
                                );

                                break;

                            case 'c':

                                System.out.println(
                                        "Enter New Phone:"
                                );

                                String newPhone =
                                        scanner.next();

                                stmt2.executeUpdate(
                                        "UPDATE employee SET phno='"
                                                + newPhone
                                                + "' WHERE empid="
                                                + updateId
                                );

                                System.out.println(
                                        "Phone Updated"
                                );

                                break;

                            case 'd':

                                System.out.println(
                                        "Enter New Email:"
                                );

                                String newEmail =
                                        scanner.next();

                                stmt2.executeUpdate(
                                        "UPDATE employee SET email='"
                                                + newEmail
                                                + "' WHERE empid="
                                                + updateId
                                );

                                System.out.println(
                                        "Email Updated"
                                );

                                break;

                            default:

                                throw new InvalidChoiceException(
                                        "Invalid Update Choice"
                                );
                        }

                        conn2.close();

                        break;

                    // ===================================
                    // DELETE
                    // ===================================

                    case 3:

                        System.out.println(
                                "Enter Employee ID:"
                        );

                        int deleteId =
                                scanner.nextInt();

                        Connection conn3 =
                                DBConnection.getConnection();

                        Statement stmt3 =
                                conn3.createStatement();

                        stmt3.executeUpdate(
                                "DELETE FROM employee WHERE empid="
                                        + deleteId
                        );

                        System.out.println(
                                "Employee Deleted"
                        );

                        conn3.close();

                        break;

                    // ===================================
                    // FETCH ALL
                    // ===================================

                    case 4:

                        Connection conn4 =
                                DBConnection.getConnection();

                        Statement stmt4 =
                                conn4.createStatement();

                        ResultSet rs1 =
                                stmt4.executeQuery(
                                        "SELECT * FROM employee"
                                );

                        while (rs1.next()) {

                            System.out.println(
                                    rs1.getInt(1)
                            );

                            System.out.println(
                                    rs1.getString(2)
                            );

                            System.out.println(
                                    rs1.getDouble(3)
                            );

                            System.out.println(
                                    rs1.getString(4)
                            );

                            System.out.println(
                                    rs1.getString(5)
                            );

                            System.out.println(
                                    rs1.getString(6)
                            );

                            System.out.println(
                                    rs1.getString(7)
                            );

                            System.out.println(
                                    "--------------------"
                            );
                        }

                        conn4.close();

                        break;

                    // ===================================
                    // FETCH BY ID
                    // ===================================

                    case 5:

                        System.out.println(
                                "Enter Employee ID:"
                        );

                        int fetchId =
                                scanner.nextInt();

                        Connection conn5 =
                                DBConnection.getConnection();

                        Statement stmt5 =
                                conn5.createStatement();

                        ResultSet rs2 =
                                stmt5.executeQuery(
                                        "SELECT * FROM employee WHERE empid="
                                                + fetchId
                                );

                        while (rs2.next()) {

                            System.out.println(
                                    rs2.getInt(1)
                            );

                            System.out.println(
                                    rs2.getString(2)
                            );

                            System.out.println(
                                    rs2.getDouble(3)
                            );

                            System.out.println(
                                    rs2.getString(4)
                            );

                            System.out.println(
                                    rs2.getString(5)
                            );

                            System.out.println(
                                    rs2.getString(6)
                            );

                            System.out.println(
                                    rs2.getString(7)
                            );
                        }

                        conn5.close();

                        break;

                    // ===================================
                    // EXIT
                    // ===================================

                    case 6:

                        System.out.println(
                                "Thank You"
                        );

                        System.exit(0);

                        break;

                   

                    default:

                        throw new InvalidChoiceException(
                                "Invalid Main Menu Choice"
                        );
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }
}
