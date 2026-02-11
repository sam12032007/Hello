import java.util.Scanner;

public class q3 {
    public static void main(String args[]) {
        Scanner sam = new Scanner(System.in);
        int a = sam.nextInt();
        int b = sam.nextInt();
        int c = sam.nextInt();
        int d = a * b * c;
        int e = a + b + c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(d / e);

    }
}
