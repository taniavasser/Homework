import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = sc.nextInt();

        if (number%7 == 0){
            number*= 2;
            System.out.println("Our current number is " + number);
        }
        else {
            System.out.println("7 divides your number with the rest");
        }
    }
}
