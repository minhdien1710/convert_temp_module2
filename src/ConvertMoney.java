import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double tigia = 23000;
        double usd, vnd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri usd");
        usd = scanner.nextDouble();
        vnd = usd*tigia;
        System.out.println("so tien vnd la:" + vnd);
    }
}
