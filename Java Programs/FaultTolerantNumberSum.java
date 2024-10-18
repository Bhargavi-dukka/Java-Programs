// <!-- 29.Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant. -->

import java.util.Scanner;

public class FaultTolerantNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        int count = 0;
        
        while (count < 5) {
            System.out.print("Enter a number (string " + (count + 1) + "): ");
            String input = scanner.nextLine();
            
            try {
                
                double number = Double.parseDouble(input);
                total += number; 
                count++;
            } catch (NumberFormatException e) {
               
                System.out.println("Invalid input: '" + input + "'. Please enter a valid number.");
            }
        }

       
        System.out.println("Total sum of valid numbers: " + total);
    }
}