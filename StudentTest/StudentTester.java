public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("abc", 10);
        s1.setT1(20);
        s1.setT2(25);
        s1.setCompre(30);

        s1.display();
        s1.calcTotal();
        s1.calcGrade(70, 60, 50);

    }
}
