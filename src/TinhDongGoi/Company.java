package TinhDongGoi;

public class Company extends Student{

    public void showInfo(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getAddress());
    }

    public static void main(String[] args) {

        //Student student = new Student("Sinh", 25, "0123456789", "Hà Nội");
        Student student = new Student();

        student.setName("Tram");
        student.setAge(30);
        student.setAddress("Đồng Tháp");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        //System.out.println(student.getPhone());
        System.out.println(student.getAddress());

        Company company = new Company();
        company.showInfo();

    }
}
