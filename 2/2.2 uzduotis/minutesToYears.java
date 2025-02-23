
import java.util.Scanner;

public class minutesToYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the nummber of minutes:");

        int minutes = Integer.valueOf(scanner.nextLine());

        int days = minutes / 1440;

        int years = days / 365;

        days = days - (years * 365);

        scanner.close();

        System.out.println(minutes + " is approximately " + years + " years and " + days + " days");

    }
}
