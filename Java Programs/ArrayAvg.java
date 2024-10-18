import java.util.Random;

class ArrayAvg{
    public static void main(String args[]){
        Random random=new Random();
        
        int array[]=new int[10];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100)+1;
            System.out.println(array[i]+" ");
            sum+=array[i];

        }
        System.out.println();
        double average=(double) sum/array.length;
        System.out.printf("%.2f%n",average);
        System.out.println();
        for(int j:array){
            if(j>average){
                System.out.println(j);
            }
        }
 
    }
}