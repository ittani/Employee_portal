package EmployeeInformation;

import java.util.Scanner;

public class CreateEmployee {

    public static void EmployeeProfile()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWould you like to create a new Employee profile? (y or n)");
        String ans = scanner.next();
        char ans1 = ans.charAt(0);

        if (ans1 == 'y')
        {
             System.out.println("Please Enter your first name");
             String firstName = scanner.next();
             System.out.println("Please Enter your last name");
             String last = scanner.next();
             System.out.println("Where are you based?");
             String location = scanner.next();
             System.out.println("How old are you?");
             int age = scanner.nextInt();
             System.out.println("What's your role?");
             String role = scanner.next();
             System.out.println("What's your current salary?");
             double salary = scanner.nextDouble();
             long workNumber = (long)(Math.random() * 9000) + 1000;
             System.out.println("Generated Work Number: " + workNumber);

            EmployeeInfo employeeInfo = new EmployeeInfo(age,firstName,last,salary,location,role,workNumber);
        }
        else
        {
            System.out.println("Thank you for your valuable time!");
        }
    }
}
