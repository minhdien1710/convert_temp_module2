import java.util.Scanner;

public class sv_thi_do {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("enter a size: ");
            size = scanner.nextInt();
            if(size>30)
                System.out.println("not available");
        }while (size>30);


        arr = new int[size];
        int i = 0;
        while (i<arr.length){
            System.out.println("nhap diem cho sinh vien " + (i+1));
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.println("danh sach diem: ");
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j] + "\t");
            if(arr[j] >= 5 && arr[j]<=10)
                count++;
        }
        System.out.println("\n so sinh vien thi do la " + count);
    }
}
