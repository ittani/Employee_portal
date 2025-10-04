package Company;

import EmployeeInformation.EmployeeInfo;

public class Company extends EmployeeInfo {
    private String branch;
    private int numemployees;

    public Company(int age, String firstName, String lastName, double salary, String location, String role,long worknumber, String location1, int numemployees) {
        super(age, firstName, lastName, salary, location, role,worknumber);
        this.branch = location1;
        this.numemployees = numemployees;
    }

    public Company(String location, int numemployees) {
        this.branch = location;
        this.numemployees = numemployees;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getNumemployees() {
        return numemployees;
    }

    public void setNumemployees(int numemployees) {
        this.numemployees = numemployees;
    }
}
