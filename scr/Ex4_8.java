import java.util.Scanner;

public class Ex4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int aLast;
        int bLast;

        aLast = a % 10;
        bLast = b % 10;

        if (aLast == bLast){
                System.out.println("true");
            }
        else if (aLast == b){
            System.out.println("true");
        }
        else if (a == bLast){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
