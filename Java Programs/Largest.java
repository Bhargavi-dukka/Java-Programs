class Largest{
    public static int findBigger(int arr[]){
        int large=Integer.MIN_VALUE;
        for(int i:arr){
            if(i>large){
                large=i;
            }
        }
        return large;
    }
    public static void main(String args[]){
        int arr[]={-6,-4,-1,-87,-98};
        int result=findBigger(arr);
        System.out.println(result);
    }
}