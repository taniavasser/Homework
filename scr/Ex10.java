import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the talk duration");
        int time = sc.nextInt();
        System.out.println("Enter the price for an hour");
        int price = sc.nextInt();
        System.out.println("Enter a day of the week (from 1 to 7)");
        int day = sc.nextInt();

        if (day <= 5 && day >= 1){
            price = time * price;
            System.out.println("The price is " + price);
        }
        else if (day == 6 || day == 7){
            price = (price - (price * 20) / 100) * time;
            System.out.println("The price is " + price);
        }
        else {
            System.out.println("Not a day number");
        }
    }
}