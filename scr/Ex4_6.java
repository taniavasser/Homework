import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;

        if (c <= 19 && c >= 11){
            System.out.println("The sum of this numbers is = " +c);
        }
        else {
            System.out.println("The sum is not in the interval [11,19]");
        }
    }
}
