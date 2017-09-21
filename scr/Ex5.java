import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b || b == c || c == a){
            System.out.println("There is a pair of numbers, which is the same");
        }
        else {
            System.out.println("There is not same numbers");
        }
    }
}
