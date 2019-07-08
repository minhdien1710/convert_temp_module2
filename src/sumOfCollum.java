import java.util.Scanner;

public class sumOfCollum {
    public static void main(String[] args) {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so hang: ");
        x = scanner.nextInt();
        System.out.println("nhap vao so cot: ");
        y = scanner.nextInt();

        int[][] array = new int[x][y];
        System.out.println("nhap gia tri cac phan tu: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma tran vua nhap: ");
        for (int i = 0 ; i< x; i++){
            for (int j= 0;j<y;j++){
                System.out.print(array[i][j]+ "  ");
            }
            System.out.print("\n");
        }
        System.out.println("nhap so cot can tinh: ");
        int n = scanner.nextInt();
        int sum= 0;
        for (int i = 0; i<x;i++){
            sum+= array[i][n-1];
        }
        System.out.println("tong cac so o cot "  + n + " la " + sum);
    }
}
