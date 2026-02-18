import java.util.Scanner;

public class userinput {
    public static void main(String args[]) {
        Scanner sam = new Scanner(System.in);
        int a = sam.nextInt();
        int b = sam.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}
