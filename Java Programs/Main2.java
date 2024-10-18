<!-- 41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, and also use treeset for the same for circle objects and see what happens. -->


import java.util.HashSet;
import java.util.TreeSet;
import java.util.Objects;

class Circle implements Comparable<Circle> {
    int x;
    int y;

    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Circle other) {
        int result = Integer.compare(this.x, other.x);
        if (result == 0) {
            return Integer.compare(this.y, other.y);
        }
        return result;
    }

    
    @Override
    public String toString() {
        return "Circle[x=" + x + ", y=" + y + "]";
    }
}

public class Main2 {
    public static void main(String[] args) {
       
        HashSet<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(1, 2));
        hashSet.add(new Circle(1, 2)); // Duplicate
        hashSet.add(new Circle(3, 4));
        hashSet.add(new Circle(5, 6));

        System.out.println("HashSet content:");
        for (Circle circle : hashSet) {
            System.out.println(circle);
        }

       
        TreeSet<Circle> treeSet = new TreeSet<>();
        treeSet.add(new Circle(1, 2));
        treeSet.add(new Circle(1, 2));
        treeSet.add(new Circle(3, 4));
        treeSet.add(new Circle(5, 6));

        System.out.println("TreeSet content:");
        for (Circle circle : treeSet) {
            System.out.println(circle);
        }
    }
}