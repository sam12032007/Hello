import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
        String name = sam.nextLine();
        double score = sam.nextDouble();
        sam.nextLine();
        String department = sam.nextLine();

        System.out.println("My name is " + name);
        System.out.println("My score is " + score / 10 + "/10");
        System.out.println("My department is " + department);
    }

}
