package employeeManagement1;

public class Employee {

    private int empid;
    private String name;
    private double salary;
    private String phno;
    private String email;
    private String address;
    private String companyName;

    public Employee(
            int empid,
            String name,
            double salary,
            String phno,
            String email,
            String address,
            String companyName
    ) {

        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.phno = phno;
        this.email = email;
        this.address = address;
        this.companyName = companyName;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getPhno() {
        return phno;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCompanyName() {
        return companyName;
    }
}
