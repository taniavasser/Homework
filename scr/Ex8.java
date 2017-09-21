import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the item");
        double price = sc.nextDouble();

        if (price > 1000){
            double totalPrice = price - (price*10)/100;
            System.out.println("You need to pay " +totalPrice+ " UAH");
        }
        else {
            System.out.println("You don't get a sale, you need to pay " +price);
        }
    }
}
