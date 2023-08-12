//String builder directly point the output or variable that can use in memory like stacxk and heap
//String builder is same as String and also extra operation can be done by String builder
//for declear this are as follow
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aman");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // set charAt index(0);
        sb.setCharAt(0, 'n');
        System.out.println(sb);
        // insert a letter in any position.
        sb.insert(0, 's');
        System.out.println(sb);
        // delete the extra letter.
        sb.delete(2, 3);
        System.out.println(sb);
        // append = append line by line sb.append
        // Reverse a string

    }
}