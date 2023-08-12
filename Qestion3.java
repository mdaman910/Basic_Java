
//take an array as number as input and check if it is an array sorted in acending order
import java.util.Scanner;

public class Qestion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // for array
        int number[] = new int[size];
        // for input loop
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("the array is shorted in ascending order");
        } else {
            System.out.println("the arrayb is not shorted in ascending order");

        }

    }

}
