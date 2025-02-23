
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");

        String tekstas = scan.nextLine();

        System.out.println("Give an integer:");

        int skaicius = Integer.parseInt(scan.nextLine());

        System.out.println("Give a double:");

        double trupmena = Double.parseDouble(scan.nextLine());

        System.out.println("Give a boolean:");

        boolean taipArNe = Boolean.valueOf(scan.nextLine());

        scan.close();

        System.out.println("You gave the string " + tekstas);
        System.out.println("You gave the integer " + skaicius);
        System.out.println("You gave the double " + trupmena);
        System.out.println("You gave the boolean " + taipArNe);
    }
}
