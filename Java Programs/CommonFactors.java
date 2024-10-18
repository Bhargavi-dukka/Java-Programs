import java.util.Scanner;

public class CommonFactors {
    
    public static void findCommonFactors(int[] numbers) {
        
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

       
        System.out.println("Common factors are:");
        for (int i = 1; i <= min; i++) {
            boolean isCommonFactor = true;
            for (int num : numbers) {
                if (num % i != 0) {
                    isCommonFactor = false;
                    break;
                }
            }
            if (isCommonFactor) {
                System.out.println(i); 
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of integers: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < size; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt(); 
        }

       
        findCommonFactors(numbers);
        
    }
}