
//take an array of names as input from the user and print them on the screen
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        // for input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        // for output
        for (int i = 0; i < names.length; i++) {
            System.out.println("names" + (i + 1) + " is: " + names[i]);
        }

    }
}
