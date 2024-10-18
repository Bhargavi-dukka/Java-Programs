public class SequenceGenerator {

    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Usage: java SequenceGenerator <num> [length]");
            return;
        }

        try {
            
            int num = Integer.parseInt(args[0]);


            int length;
            if (args.length >= 2) {
                length = Integer.parseInt(args[1]);
            } else {
                
                length = 10;
            }

           
            generateSequence(num, length);

        } catch (NumberFormatException e) {
            System.out.println("Arguments must be integers. Please check your input.");
        }
    }

  
    private static void generateSequence(int num, int length) {
        System.out.print("Generated sequence: ");
        for (int i = 0; i < length; i++) {
            System.out.print(num + i + " ");
        }
        System.out.println();
    }
}
