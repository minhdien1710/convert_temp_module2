import java.util.Scanner;

public class xoaPhanTu {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr1 = new int[arr.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri can xoa: ");
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                for (int j = 0; j < i; j++) {
                    arr1[j] = arr[j];
                }
                for (int k = i + 1; k < arr.length; k++) {
                    arr1[k - 1] = arr[k];
                }

            }
        }
        System.out.println("mang sau khi xoa: ");
        for (int a : arr1) {
            System.out.println(a + " ");
        }
    }
}
