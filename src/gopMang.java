import java.util.Scanner;

public class gopMang {
    public static void main(String[] args) {
        int size1, size2;
        int[] arr1, arr2, arr3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan  tu cua mang thu nhat");
        size1 = scanner.nextInt();
        arr1 = new int[size1];
        int i = 0;
        while (i < size1) {
            System.out.println("nhap phan tu " + (i + 1));
            arr1[i] = scanner.nextInt();
            i++;
        }

        System.out.println("nhap so phan tu cua mang 2");
        size2 = scanner.nextInt();
        arr2 = new int[size2];
        int j = 0;
        while (j < size2) {
            System.out.println("nhap phan tu " + (j + 1));
            arr2[j] = scanner.nextInt();
            j++;
        }
        arr3 = new int[size1 + size2];
        System.arraycopy(arr1, 0, arr3, 0, size1);
        for(int k = 0; k<size2;k++){
            arr3[k+size1]=arr2[k];
        }
        for (int element:arr3
             ) {
            System.out.println(element);
        }

    }

}

