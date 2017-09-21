import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the first number");
        double a = sc.nextInt();
        System.out.println("Input the second number");
        double b = sc.nextInt();
        System.out.println("Input the third number");
        double c = sc.nextInt();

        if (a >= 0){
            a = Math.pow(a,3);
           System.out.println("a=" +a);
        }
        else {
            a = 0;
            System.out.println("a=" +a);
        }
        if (b >= 0){
            b = Math.pow(b,3);
            System.out.println("b=" +b);
        }
        else {
            b = 0;
            System.out.println("b=" +b);
        }
        if (c >= 0){
            c = Math.pow(c,3);
            System.out.println("c=" +c);
        }
        else {
            c = 0;
            System.out.println("c=" +c);
        }
    }

}
