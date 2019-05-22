public class MinValueInAraay {
    private static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min){
              min = array[i];
              index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] arr = {4,5,3,56,43,12,1,9};
        int index = minValue(arr);
        System.out.println("Min element in array is:" + arr[index]);
    }
}
