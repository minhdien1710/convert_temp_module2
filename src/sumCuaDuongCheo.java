import java.util.Scanner;

public class sumCuaDuongCheo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich thuoc cua ma tran: ");
        int m = scanner.nextInt();

        int[][] array = new int[m][m];
        System.out.println("nhap gia tri cho cac phan tu: ");
        for (int i = 0;i<m;i++){
            for (int j = 0; j<m;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i <m; i++){
            sum += array[i][i];

        }
        System.out.println("tong cac so tren duong cheo la " + sum);

    }
}
