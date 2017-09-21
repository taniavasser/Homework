import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input distance (km) and speed (km/h)");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double t = a/b;

        System.out.println("You are gonna reach your destination in " +t+ " hours");
    }
}
