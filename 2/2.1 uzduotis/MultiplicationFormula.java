
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int skaicius1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int skaicius2 = Integer.valueOf(scanner.nextLine());

        int sandauga = skaicius1 * skaicius2;

        scanner.close();

        System.out.println(skaicius1 + " * " + skaicius2 + " = " + sandauga);

    }
}
