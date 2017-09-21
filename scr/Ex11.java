import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number in interval from 1 to 99");
        int a = sc.nextInt();

        if (a >= 1 && a <= 99){
            if (a == 1 || (a % 10) == 1){
                System.out.println(a+ " копейка");
            }
            else if (a == 2 || (a % 10) == 2){
                System.out.println(a+ " копейки");
            }
            else if (a == 3 || (a % 10) == 3){
                System.out.println(a+ " копейки");
            }
            else if (a == 4 || (a % 10) == 4){
                System.out.println(a+ " копейки");
            }
            else {
                System.out.println(a+ " копеек");
            }
        }
    }
}
