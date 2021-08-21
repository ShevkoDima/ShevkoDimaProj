import java.util.Scanner;

public class RecursiveFibanachi {

    static int recursiveFibonachi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return recursiveFibonachi(n - 1) + recursiveFibonachi(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.println(recursiveFibonachi(num));
    }
}
