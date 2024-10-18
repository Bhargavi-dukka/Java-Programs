// 14. Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.

public class Counter {
    private int count;


    public Counter() {
        this.count = 0;
    }


    public Counter(int initialCount) {
        this.count = initialCount;
    }


    public void increment() {
        this.count++;
    }

    
    public void decrement() {
        this.count--;
    }

    
    public int getCount() {
        return this.count;
    }


    public static void main(String[] args) {
        
        Counter counter1 = new Counter();
        System.out.println("Initial count (counter1): " + counter1.getCount()); // 0
        counter1.increment();
        System.out.println("After increment (counter1): " + counter1.getCount()); // 1
        counter1.decrement();
        System.out.println("After decrement (counter1): " + counter1.getCount()); // 0

        
        Counter counter2 = new Counter(10);
        System.out.println("Initial count (counter2): " + counter2.getCount()); // 10
        counter2.increment();
        System.out.println("After increment (counter2): " + counter2.getCount()); // 11
    }
}
