import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sides of the triangle ");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        if (a == Math.sqrt(Math.pow(b,2) + Math.pow(c,2)) || b == Math.sqrt(Math.pow(a,2) + Math.pow(c,2)) || c == Math.sqrt(Math.pow(b,2) + Math.pow(a,2))){
            System.out.println("The triangle is right");
        }
        else {
            System.out.println("The triangle is not right");
        }

    }
}
