package EmployeeInformation;

import java.util.Scanner;
import java.util.Arrays;

public class ValidateEmployee {

    // Define the list of valid work numbers as a constant
    private static final long[] COMPANY_WORK_NUMBERS = {
            1324, 3536, 2727, 7654, 9032, 4536, 7890, 4432, 3215, 5643, 9065, 5437, 1234
    };

    public static void validateEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("              Welcome to Noventa Group");
        System.out.println("************************************************************");
        System.out.print("Please enter your work number (4 digits): ");

        // Validate user input safely
        while (!scanner.hasNextLong()) {
            System.out.print("Invalid input! Please enter a 4-digit number: ");
            scanner.next();
        }

        long workNum = scanner.nextLong();

        // Check if workNum exists in the company list
        boolean exists = Arrays.stream(COMPANY_WORK_NUMBERS).anyMatch(num -> num == workNum);

        if (exists) {
            System.out.println("\n✅ The user already exists!");
        } else {
            System.out.println("\n🆕 This employee number doesn't exist!");
        }

        // Proceed to employee creation/profile either way
        CreateEmployee.displayEmployeeProfile(workNum, exists);

        scanner.close();
    }
}