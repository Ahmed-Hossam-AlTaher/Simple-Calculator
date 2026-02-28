import java.util.Scanner;
import java.util.Locale;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        System.out.print("Enter number one: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number two: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double div = num1 / num2;
        double mul = num1 * num2;
        double mod = num1 % num2;

        System.out.print("\n");
        System.out.println("Num1 + num2 = " + sum);
        System.out.println("Num1 - num2 = " + sub);
        System.out.println("Num1 / num2 = " + div);
        System.out.println("Num1 * num2 = " + mul);
        System.out.println("Num1 % num2 = " + mod);
    }
}