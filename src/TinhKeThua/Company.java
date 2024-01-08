package TinhKeThua;

public class Company {
    private String companyName;
    private String initYear;
    private String address;
    private int employeeTotal;
    private String businessAreas;
    private String CEO;

    public Company(String companyName, String initYear, String address, int employeeTotal, String businessAreas, String CEO) {
        this.companyName = companyName;
        this.initYear = initYear;
        this.address = address;
        this.employeeTotal = employeeTotal;
        this.businessAreas = businessAreas;
        this.CEO = CEO;
    }

    public void showInfo(){
        System.out.println(companyName);
        System.out.println(initYear);
        System.out.println(address);
        System.out.println(employeeTotal);
        System.out.println(businessAreas);
        System.out.println(CEO);
    }

}
