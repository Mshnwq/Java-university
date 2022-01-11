package lab8;

public class Student {
    String name;
    static int test1;
    static int test2;

    public Student(String studentName) {
        name = studentName;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Name: " + name + "   Test 1: " + test1 + "   Test 2: " + test2;
    }
    public static void displayInfo(String n) {
        System.out.printf("I am method displayInfo%s()%n",n);
    }
    public void setGrade1(int test1) {
        Student.test1 = test1;
    }
    public void setGrade2(int test2) {
        Student.test2 = test2;
    }
    public static double getAverage() {
        double Ave = (test1 + test2)/2.0;
        return Ave;
    }
    public static boolean compare() {
        return Student.getAverage() > 50;
    }
}