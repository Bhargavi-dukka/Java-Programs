import java.util.Scanner;
class StringVertical{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String String1=sc.nextLine();
        for(int i=0;i<String1.length();i++){
            System.out.println(String1.charAt(i));
        }
    }
}