
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int skaicius1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int skaicius2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");

        int skaicius3 = Integer.valueOf(scanner.nextLine());

        int suma = skaicius1 + skaicius2 + skaicius3;

        scanner.close();

        System.out.println("The sum of the numbers is " + suma);

    }
}
