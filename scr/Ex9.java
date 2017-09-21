import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height and weight");

        double height = sc.nextDouble();
        double weight = sc.nextDouble();
        double normalWeight = height - 100;

        if (weight > normalWeight){
            System.out.println("You need a diat");
        }
        else if (weight < normalWeight){
            System.out.println("You need to eat more");
        }
        else {
            System.out.println("You weight is perfect");
        }

    }
}
