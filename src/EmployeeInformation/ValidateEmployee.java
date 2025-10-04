package EmployeeInformation;

import java.util.Scanner;

public class ValidateEmployee {

    public  static void ValidatingEmployee()
    {
        long[] Companyworknumbers = {1324,3536,2727,7654,9032,4536,7890,4432,3215,5643,9065,5437,1234};
        Scanner scanner = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("\nWelcome to Noventa Group");
        System.out.println("Please enter your work number? (4 digits)");
        long worknum = scanner.nextLong();

        boolean exists = false;


        for (long num : Companyworknumbers) {
            if (worknum == num)
                exists = true;
            break;
        }

        if(exists)
        {
            System.out.println("\nThe User Already Exists!");
            CreateEmployee.EmployeeProfile();
        }
        else
        {
            System.out.println("\nThe employee number doesn't exists!");
            CreateEmployee.EmployeeProfile();

        }
        scanner.close();
    }

}
