import EmployeeInformation.*;
import EmployeeInformation.CreateEmployee;

import java.util.Scanner;

import static System.SystemCheck.checking;

public class Main {

    public static void main(String[] args) {
        checking();
        Scanner scanner = new Scanner(System.in);

        ValidateEmployee.validateEmployee();

        scanner.close();
    }

}