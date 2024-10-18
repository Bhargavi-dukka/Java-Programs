// Even 1 to 50

class Even{
    public static void recursionOf(int i){
           if(i>50){
            return;
           }
        
            System.out.println(i);
            recursionOf(i+1);
           
    }
    public static void main(String args[]){
        
        recursionOf(1);
    }
    
}