import java.util.Scanner;

public class distanceOfPoints {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter x1:");

        double x1 = Double.valueOf(scanner.nextLine());

        System.out.println("enter y1:");

        double y1 = Double.valueOf(scanner.nextLine());

        System.out.println("enter x2:");

        double x2 = Double.valueOf(scanner.nextLine());

        System.out.println("enter y2:");

        double y2 = Double.valueOf(scanner.nextLine());

        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        scanner.close();

        System.out.println("The distance between two points is " + distance);

    }
}
