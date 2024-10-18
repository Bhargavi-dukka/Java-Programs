// Factor

import java.util.Scanner;
class Factor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int result=largest(n);
        if(result==1){
            System.out.println("Prime");
        }
        else{
            System.out.println(result);
        }
    }
    public static int largest(int n){
        for(int i=n-1;i>=1;i--){
            if(n%i==0){
              return i;
            }
           
        }
        return 1;
    }
}