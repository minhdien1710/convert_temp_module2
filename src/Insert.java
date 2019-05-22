import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int size = arr.length;
        int[] arr1 = new int[size + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("num:");
        int num = scanner.nextInt();
        System.out.println("index:");
        System.out.println();
        int index = scanner.nextInt();
        if (index < 0 || index > arr1.length) {
            System.out.println("vi tri ko hop le");
        } else {
            for (int i = 0; i < index; i++) {
                arr1[i] = arr[i];
            }
            arr1[index] = num;
            for (int j = index + 1; j < arr1.length; j++) {
                arr1[j] = arr[j - 1];
            }
            System.out.println("mang sau khi chen");
            for (int i : arr1) {
                System.out.println(i);
            }
        }
    }
}


