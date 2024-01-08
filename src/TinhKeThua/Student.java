package TinhKeThua;

public class Student extends Person{

    public Student(int age, float height, String name) {
        super(name, age, height);
    }

    public static void main(String[] args) {

        Student student = new Student(30, 165, "Trâm");
        student.getInfo();

    }

}
