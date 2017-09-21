import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите скорость ветра в м/с");
        double speed = sc.nextDouble();

        if (speed >= 1 && speed <= 4){
            System.out.println("ветер слабый");
        }
        else if (speed >= 5 && speed <= 10){
            System.out.println("ветер умеренный");
        }
        else if (speed >= 11 && speed <= 18){
            System.out.println("ветер сильный");
        }
        else if (speed >= 19){
            System.out.println("ветер ураганный");
        }
    }
}
