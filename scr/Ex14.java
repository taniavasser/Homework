import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите шестизначное число");
        int a = sc.nextInt();
        int first = a/100000;
        int second = a%100000/10000;
        int third = a%10000/1000;
        int forth = a%1000/100;
        int fifth = a%100/10;
        int sixth = a%10;

        if (first + second + third == forth + fifth + sixth){
            System.out.println("Ваше число счасливое");
        }
        else {
            System.out.println("Ваше число обычное");
        }

    }
}
