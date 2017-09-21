import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("input A, B, C");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c > 0){
            a*= 2;
            b*= 2;
            c*= 2;
            System.out.println("New numbers: " +a+ "," +b+ "," +c);
        }
        else {
            a = 0;
            b = 0;
            c = 0;
            System.out.println("New numbers: " +a+ "," +b+ "," +c);
        }
    }
}
