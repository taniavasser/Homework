import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b){
            c = a - b;
            System.out.println("Subtraction of this numbers is = " +c);
        }
        else {
            c = a + b;
            System.out.println("Sum of this numbers is = " +c);
        }
    }
}
