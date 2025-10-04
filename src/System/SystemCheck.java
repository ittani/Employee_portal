package System;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SystemCheck {
    public static void checking()
    {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);

        System.out.println("\nWelcome to Noventa Group System");
        System.out.println("Today's Date: " + formattedDate);

        System.out.println("Happy Day to you!");
    }
}
