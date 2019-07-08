import java.util.Scanner;

public class maxValue_mang2Chieu {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so hang: ");
        m = scanner.nextInt();
        System.out.println("nhap vao so cot: ");
        n = scanner.nextInt();

        int[][] array = new int[m][n];
        System.out.println("nhap gia tri cac phan tu: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = array[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(max < array[i][j])
                    max = array[i][j];
            }
        }
        System.out.println("gia tri lon nhat cua ma tran la: "+ max);
    }
}