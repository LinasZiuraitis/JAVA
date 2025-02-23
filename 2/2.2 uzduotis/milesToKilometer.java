
import java.util.Scanner;

public class milesToKilometer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");

        int miles = Integer.valueOf(scanner.nextLine());

        double kilometers = (double)miles * 1.6;

        scanner.close();

        System.out.println(miles + " miles is " + kilometers + " kilometers ");

    }
}
