import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число с плавающей запятой");
        double x = sc.nextDouble();

        if (x <= 1 && x >= 0){
            System.out.println("Число лежит в диапазоне [0,1]");
        }
        else {
            System.out.println("Число не лежит в заданом диапазоне");
        }
    }
}
