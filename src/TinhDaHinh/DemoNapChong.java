package TinhDaHinh;

public class DemoNapChong {

    public int tinhTong(int number1, int number2) {
        return number1 + number2;
    }

    public int tinhTong(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    public double tinhTong(int number1, int number2, double number3) {
        return number1 + number2 + number3;
    }

    public void createBrowser(String browserName) {
        System.out.println("Chạy với trình duyệt: " + browserName);
    }

    public void createBrowser() {
        System.out.println("Chạy với trình duyệt mặc định: Chrome");
    }

    public static void main(String[] args) {

        DemoNapChong demoNapChong = new DemoNapChong();
        System.out.println(demoNapChong.tinhTong(20, 30));
        System.out.println(demoNapChong.tinhTong(20, 30, 10));

        demoNapChong.createBrowser();

        demoNapChong.createBrowser("Edge");
    }
}
