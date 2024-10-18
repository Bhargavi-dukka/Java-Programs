import java.util.Scanner;

public class CollectNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        StringBuilder names = new StringBuilder(); 

        System.out.println("Enter names (type 'END' to stop):");

       
        while (true) {
            String name = scanner.nextLine(); 

           
            if (name.equalsIgnoreCase("END")) {
                break;
            }


            if (names.length() > 0) {
                names.append("-");
            }
            names.append(name);
        }

        
        System.out.println("Names entered: " + names.toString());
    }
}
