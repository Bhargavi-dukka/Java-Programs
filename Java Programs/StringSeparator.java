// 44. Write a program to accept a string & display each word on a separate line (use any separator)

import java.util.Scanner;

public class StringSeparator {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the separator (space, comma, etc.): ");
        String separator = scanner.nextLine();

       
        String[] words = input.split(separator);

        System.out.println("\nWords displayed on separate lines:");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
