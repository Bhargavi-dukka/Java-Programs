import java.util.Scanner;

public class InvertCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        StringBuilder invertedString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);


            if (Character.isUpperCase(ch)) {
                invertedString.append(Character.toLowerCase(ch));
            }

            else if (Character.isLowerCase(ch)) {
                invertedString.append(Character.toUpperCase(ch));
            }

            else {
                invertedString.append(ch);
            }
        }
        System.out.println("Inverted case string: " + invertedString.toString());
    }
}
