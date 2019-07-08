import java.util.Scanner;

public class soLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "[BOOTCAMP-JAVA] Web Back-end Development";
        System.out.println("nhap vao 1 ki tu");
        String x = scanner.nextLine();

        int count = 0;
        String[] arr = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (x.equals(arr[i])) {
                count += 1;
            }


        }
        System.out.println("ky tu " + x + " xuat hien " + count + " lan");
    }
}
