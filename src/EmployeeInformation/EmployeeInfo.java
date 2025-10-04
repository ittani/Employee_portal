package EmployeeInformation;

public class EmployeeInfo {
    private int age;
    private String firstName;
    private String lastName;
    private double salary;
    private String location;
    private String role;
    private long worknumber;

    public EmployeeInfo(int age, String firstName, String lastName, double salary, String location, String role, long worknum) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.location = location;
        this.role = role;
        this.worknumber=worknum;
    }

    public EmployeeInfo() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public long getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(long worknumber) {
        this.worknumber = worknumber;
    }

    @Override
    public String toString() {
        return "\n--- Employee Profile ---" +
                "\nName: " + firstName + " " + lastName +
                "\nAge: " + age +
                "\nRole: " + role +
                "\nLocation: " + location +
                "\nSalary: R" + salary +
                "\nWork Number: " + worknumber +
                "\n------------------------";
    }
}
