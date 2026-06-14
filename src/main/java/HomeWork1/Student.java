package HomeWork1;

public class Student extends Person {
    String courseName;

    public Student() {
    }

    void printStudentInfo() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nCourse name: " + this.courseName);
    }

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "George";
        firstStudent.age = 27;
        firstStudent.courseName = "Web/Api";
        firstStudent.printInfo();
        firstStudent.printStudentInfo();
    }
}
