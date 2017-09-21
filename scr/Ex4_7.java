import java.util.Scanner;

public class Ex4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

         if (a % b == 0){
             c = a/b;
             System.out.println("True");
             System.out.println("the integral part =" +c+ " and the fractional part =" +(a % b));
         }
         else if (b % a == 0){
             c = b/a;
             System.out.println("True");
             System.out.println("the integral part =" +c+ " and the fractional part =" +(b % a));
         }
         else {
             System.out.println("false");
             System.out.println("By dividing a/b we achieve the integer part =" +(a / b)+ " and the fractional part =" + (a % b));
             System.out.println("By dividing b/a we achieve the integral part =" +(b / a)+ " and the fractional part =" +(b % a));
         }
    }
}
