import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your current time");
        double time = sc.nextDouble();

        if (time <= 18 && time >= 9){
            System.out.println("I am at work");
        }
        else if (time > 24 || time < 0){
            System.out.println("Not existing time");
        }
        else {
            System.out.println("I am resting");
        }
    }
}
