import java.util.Scanner;

public class Fibanachi {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        int result;

        for (int i = 1; i < num; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            System.out.println(result);
        }
    }
}