
// find the maximum & minimum number in an array of integer
import java.util.Scanner;
//import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        // for input loop
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        // FOR OUTPUT LOOP
        for (int i = 0; i < number.length; i++) {
            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("largest number is :" + max);
        System.out.println("smallest number is :" + min);

    }
}
