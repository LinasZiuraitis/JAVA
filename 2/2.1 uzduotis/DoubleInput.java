
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        double skaicius = Double.parseDouble(scanner.nextLine());

        scanner.close();

        System.out.println("You gave the number " + skaicius);

    }
}
