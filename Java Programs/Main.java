class Student {
    private String name;
    private int age;
    private String grade;


    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

  
    @Override
    public boolean equals(Object obj) {
       
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age &&
               name.equals(student.name) &&
               grade.equals(student.grade);
    }

    
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + grade.hashCode();
        return result;
    }

   
    @Override
    public String toString() {
        return "Student{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", grade='" + grade + '\'' +
               '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20, "A");
        Student student2 = new Student("Alice", 20, "A");
        System.out.println("Are the two students equal? " + student1.equals(student2));
        System.out.println("Student 1 HashCode: " + student1.hashCode());
        System.out.println("Student 2 HashCode: " + student2.hashCode());
        System.out.println(student1.toString());
    }
}
