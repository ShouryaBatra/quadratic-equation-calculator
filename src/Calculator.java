import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.println();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println();

        System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);

        double ans1 = ((-1.0 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        double ans2 = ((-1.0 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        System.out.println("Answer: " + ans1 + ", " + ans2);
    }
}
