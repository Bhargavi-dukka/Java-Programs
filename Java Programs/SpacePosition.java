import java.util.Scanner;

public class SpacePosition {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); 

        
        StringBuilder positions = new StringBuilder();


        for (int i = 0; i < inputString.length(); i++) {

            if (inputString.charAt(i) == ' ') {
                
                positions.append(i).append(" ");  // Append position with a space
            }
        }
        System.out.println(positions.toString().trim());

        
        // if (positions.length() > 0) {
        //     System.out.println("Positions of spaces: " + positions.toString().trim());
        // } else {
        //     System.out.println("No spaces found in the string.");
        // }

    }
}
