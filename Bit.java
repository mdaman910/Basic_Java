//public import java.util.*;
//set bits

public class Bits {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}
