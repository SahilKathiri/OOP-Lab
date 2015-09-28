public class Student {
    private int t1;
    private int t2;
    private int compre;
    private int total;

    public String name;
    public int age;

    // Constructors
    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setters
    public void setT1(int t1) {
        this.t1 = t1;
    }
    public void setT2(int t2) {
        this.t2 = t2;
    }
    public void setCompre(int compre) {
        this.compre = compre;
    }

    // DIsplay
    public void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student age: " + age);
        System.out.println("Marks:\nT1 = " + t1 + "\nT2 = " + t2 + "\nCompre = " + compre);

    }

    // Calculations
    public void calcTotal() {
        total = t1 + t2 + compre;
        System.out.println("Total marks = " + total);
    }

    public void calcGrade(int a, int b, int c) {
        if (total >= a)
            System.out.println("A Grade");
        else if (total <= a && total >= b)
            System.out.println("B Grade");
        else if (total <= b && total >= c)
            System.out.println("C Grade");
        else if (total <= c)
            System.out.println("D Grade");
        else
            System.out.println("Invalid");
    }
}
