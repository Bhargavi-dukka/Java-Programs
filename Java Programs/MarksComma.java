import java.util.Scanner;
class MarksComma{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int sum=0;
        String marks[]=input.split(",");
        for(String i:marks){
            sum+=Integer.parseInt(i.trim());
        }
        System.out.println(sum);

    }
}