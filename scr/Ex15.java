import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите площадь круга и квадрата в м^2");
        double S1 = sc.nextDouble();
        double S2 = sc.nextDouble();
        double r;
        double a;

        r = Math.sqrt((S1/Math.PI));
        a = Math.sqrt(S2);
        double d = Math.sqrt(2 * Math.pow(a,2));

        if (d <= r){
            System.out.println("Квадрат вместиться в круге");
        }
        else if (a >= 2 * r){
            System.out.println("Круг вместится в квадрате");
        }
    }
}
