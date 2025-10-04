package EmployeeInformation;

import java.util.Scanner;

public class CreateEmployee {

    public static DisplayNewEmployeeInfo displayEmployeeProfile(long workNum, boolean exists) {
        Scanner scanner = new Scanner(System.in);

        if (exists) {
            System.out.println("\nEmployee with work number " + workNum + " already exists!");
            System.out.println("Would you like to update their details? (y/n)");
        } else {
            System.out.println("\nWould you like to create a new Employee profile? (y or n)");
        }

        String ans = scanner.next();
        char ans1 = ans.charAt(0);

        if (ans1 == 'y') {
            System.out.println("Please Enter your first name:");
            String firstName = scanner.next();

            System.out.println("Please Enter your last name:");
            String last = scanner.next();

            System.out.println("Where are you based?");
            String location = scanner.next();

            System.out.println("How old are you?");
            int age = scanner.nextInt();

            System.out.println("What's your role?");
            String role = scanner.next();

            System.out.println("What's your current salary?");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid numeric salary:");
                scanner.next();
            }
            double salary = scanner.nextDouble();

            long workNumber = exists ? workNum : (long) (Math.random() * 9000) + 1000;

            EmployeeInfo employeeInfo =
                    new EmployeeInfo(age, firstName, last, salary, location, role, workNumber);

            System.out.println("\n✅ Employee profile created successfully!");
            System.out.println(employeeInfo);
        } else {
            System.out.println("\nThank you for your valuable time!");
        }

        scanner.close();
        return null;
    }
}