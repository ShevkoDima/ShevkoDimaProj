import java.util.Scanner;

public class StringSplit {

    static void splitOnChars() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input any word: ");
        String str = in.next();
        char[] strToArray = str.toCharArray();
        for (char c : strToArray) {
            System.out.print(c + " ");
        }
    }

    static void splitOnWords() {
        String str = "Hello World !";
        String[] words = str.split("\\s");
        for (String subStr : words) {
            System.out.println(subStr);
        }
    }

    public static void main(String[] args) {
        splitOnChars();
        System.out.println();
        splitOnWords();
    }
}