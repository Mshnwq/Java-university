package lab8;

public class Grades {
    public static void main(String[] args) {

        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");



        student1.setGrade1(55);
        student1.setGrade2(60);
        System.out.println("The average for " + student1.getName() + " is " + Student.getAverage() + ".");
        System.out.println("The average is > 50: "+ Student.compare());

        student2.setGrade1(5);
        student2.setGrade2(6);
        System.out.println("The average for " + student2.getName() + " is " + Student.getAverage() + ".");
        System.out.println("The average is > 50: "+ Student.compare());

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        Student.displayInfo("1");
        Student.displayInfo("");
    }
}