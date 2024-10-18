// Work 

import java.util.Scanner;
class Work{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int hours=sc.nextInt();
        double wage=calculateWage(day,hours);
        System.out.println(wage);
    }
    public static double calculateWage(int day,int hours){
        double wageperhr=switch(day){
            case 1,2,3->200;
            case 4,5->400;
            case 6->600;
            case 7->800;
            default->0;
        };
            double totalwage=wageperhr*hours;
            if (totalwage>2000){
                totalwage*=1.1;
            }
            return totalwage;
        }
    }