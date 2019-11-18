import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Array<Double> arr = new Array<>(10);
        Scanner sc = new Scanner(System.in);
        boolean readNum = true;
        while (readNum){
            double number = sc.nextDouble();
            if (number == 0){
                break;
            }
            arr.addLast(number);
        }
        System.out.println("The maximum number is " + findMax(arr,0));
        System.out.println("The total number of negative numbers is " + countNegative(arr,arr.getSize(),0));
        System.out.println("The sum of positive numbers is " + computeSumPositive(arr, arr.getSize()));
    }

    /**
     * finds the maximum number in the array, count is the number of numbers stored in the array
     * @param arr
     * @param count
     * @return
     */
    public static double findMax(Array<Double> arr, int count){
        if(count == arr.getSize() - 1){
            return arr.get(count);
        }
        return Math.max(arr.get(count), findMax(arr,count + 1));
    }

    /**
     * returns the count of negative numbers
     * @param arr
     * @param count
     * @return
     */
    public static int countNegative(Array<Double> arr, int count, int negative){
        if(count == 0 ){
            return negative;
        }
        if(arr.get(count - 1) < 0 && count - 1 >= 0){
            negative = negative + 1;
        }
        countNegative(arr, count - 1, negative);
        return negative;
    }

    /**
     *
     * @param arr
     * @param count
     * @return
     */
    public static double computeSumPositive(Array<Double> arr, int count) {
        if(count == 0){
            return 0;
        }
        return arr.get(count -1) + computeSumPositive(arr, count - 1) ;
    }
}
