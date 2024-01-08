package TinhKeThua;

public class Employee extends Company{

    public Employee(String companyName, String initYear, String address, int employeeTotal, String businessAreas, String CEO) {
        super(companyName, initYear, address, employeeTotal, businessAreas, CEO);
    }

    public void showInfo(){
        System.out.println("Đây là của class Employee.");
        super.showInfo(); //Gọi từ class Company
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Viettel", "1950", "Hà Nội", 30000, "Viễn Thông", "Mạnh Hùng");
        employee.showInfo(); //Của class Employee
    }

}
