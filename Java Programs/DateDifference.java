import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        System.out.print("Enter the starting date (DD-MM-YYYY): ");
        String startDateInput = scanner.nextLine();
        
        System.out.print("Enter the ending date (DD-MM-YYYY): ");
        String endDateInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateInput, dateFormatter);
        LocalDate endDate = LocalDate.parse(endDateInput, dateFormatter);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Number of days between " + startDateInput + " and " + endDateInput + " is: " + daysBetween);


    }
}
