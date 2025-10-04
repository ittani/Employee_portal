package EmployeeInformation;

public class DisplayNewEmployeeInfo {
    public static void DisplayEmployee(EmployeeInfo employee) {
        if (employee != null) {
            System.out.println(employee.toString());
        } else {
            System.out.println("No employee profile to display.");
        }
    }
}
