public class prime_smaller_than_100 {
    public static void main(String[] agrs) {
        int num;
        for (num = 2; num < 100; num++) {
            if (isPrime(num))

                System.out.println(num);
        }
    }

    public static boolean isPrime(int n) {
        int i = 2;
        while (i<Math.sqrt(n)){
            if(n%i ==0){
                return false;
            }
            i++;
        }return true;
    }
}

