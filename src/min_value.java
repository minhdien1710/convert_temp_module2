import java.util.Scanner;

public class min_value {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap do dai cua mang:");
        size = scanner.nextInt();
        arr = new int[size];
        for(int i =0;i<size; i++){
            System.out.println("nhap gia tri phan tu "+ (i+1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j=1;j<arr.length;j++){
            if (arr[j]<min)
                min= arr[j];
        }
        System.out.println("gia tri nho nhat cua mang la" + min);
    }
}
