// Average

import java.util.Scanner;
class Average{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
            for(int i=0;i<5;i++){
                int j=sc.nextInt();
            
                sum+=j;
            }
            double avg=sum/5;
            System.out.println(avg);
        }
    }