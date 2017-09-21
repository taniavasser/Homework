import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input two speeds, first in (km/h) and second in (m/s)");

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        a = a * 1000/3600;

        if (a > b){
            System.out.println("The first speed is bigger");
        }
        else {
            System.out.println("The second speed is bigger");
        }

    }
}
