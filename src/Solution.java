import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[3];
        if (args.length != 3) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                array[i] = scanner.nextInt();
            }
        }
        else {
            for (int i = 0; i < 3; i++) {
                array[i] = Integer.parseInt(args[i]);
            }
        }

        solution(array);
        System.out.println(Arrays.toString(array));
    }

    private static void solution(int[] array) {
        int total_changes = 6;
        for (int i = 0; i < 3; i++) {
            int digits = (int) Math.log10(array[i]);
            if (array[i] % 3 != 0) {
                array[i] = increaseDigitBy(array[i], digits, 3 - array[i] % 3);
                total_changes -= 2;
            }
        }
        if (total_changes != 0)
            maximizeSum(array, total_changes);
    }

    private static void maximizeSum(int[] array, int changes) {
        int max_index = 0;
        for (int i = 1; i < 3; i++) {
            if (array[i] > array[max_index])
                max_index = i;
        }
        array[max_index] = increaseDigitBy(array[max_index], (int) Math.log10(array[max_index]), changes);
    }

    private static int increaseDigitBy(int number, int index, int increase) {
        if (increase == 0)
            return number;

        int digit = (int) (number / Math.pow(10, index))%10;
        if (digit < 9) {
            number += Math.pow(10, index);
            return increaseDigitBy(number, index, --increase);
        }
        else return increaseDigitBy(number, index-1, increase);
    }
}
