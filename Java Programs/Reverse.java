import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rem;
       
        while(n!=0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;

        }
        System.out.println(sum);
    }
}