import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.creatRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chi so cua phan tu bat ky");
        int x = scanner.nextInt();
        try {
            System.out.println("gia tri phan tu co chi so " + x + " la: " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("chi so khong hop le");
        }
    }
    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu:");
        for (int i =0; i<100; i++){
            arr[i] = random.nextInt(100);
            System.out.println(arr[i]+ " ");
        }
        return arr;
    }
}
