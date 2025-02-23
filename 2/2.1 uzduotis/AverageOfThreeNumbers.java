
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");

        int skaicius1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");

        int skaicius2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");

        int skaicius3 = Integer.valueOf(scanner.nextLine());

        double vidurkis = (double)(skaicius1 + skaicius2 + skaicius3)/3;

        scanner.close();

        System.out.println("The average is " + vidurkis);

    }
}
