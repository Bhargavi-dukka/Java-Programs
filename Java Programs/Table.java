//  15th table 

// public class Table {
//     public static void main(String[] args) {
//         int num = 15;
//         int length = 10;

//         System.out.println("Table of " + num + " with length " + length + ":");
//         for (int i = 1; i <= length; i++) {
//              System.out.printf("%d * %d = %d%n", num, i, num * i);
//             // System.out.println("15*"+i+"="+num*i);
//         }
//     }
// }

public class Table{
      public static void recursion(int i){
        int m=15,n=10;
        if(i>n){
            return;
        }
        else{
            System.out.printf("%d*%d=%d%n",m,i,m*i);
            recursion(i+1);
        }
      }

    public static void main(String args[]){
       
        recursion(1);
    }
}
[6:08 pm, 29/9/2024] Bhargavi: 