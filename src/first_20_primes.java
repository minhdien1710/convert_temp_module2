import java.util.Scanner;

public class first_20_primes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong:");
        int num = scanner.nextInt();
        int count = 0;
        int n = 2;
        for (n= 2; count < num; n++){
            if(isPrime(n)){
                count++;
                System.out.println(n);
            }
        }
    }
    public static boolean isPrime(int n){
        int i =2;
        while (i<Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }return true;
    }
}
