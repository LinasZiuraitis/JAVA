
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int skaicius1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int skaicius2 = Integer.valueOf(scanner.nextLine());

        int suma = skaicius1 + skaicius2;
        int skirtumas = skaicius1 - skaicius2;
        int sandauga = skaicius1 * skaicius2;
        double dalyba = (double)skaicius1 / skaicius2;

        scanner.close();

        System.out.println(skaicius1 + " + " + skaicius2 + " = " + suma);
        System.out.println(skaicius1 + " - " + skaicius2 + " = " + skirtumas);
        System.out.println(skaicius1 + " * " + skaicius2 + " = " + sandauga);
        System.out.println(skaicius1 + " / " + skaicius2 + " = " + dalyba);
    }
}
