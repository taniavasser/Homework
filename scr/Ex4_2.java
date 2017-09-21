import java.util.Random;

public class Ex4_2 {
    public static void main(String[] args) {
        int a, b, c;
        Random random = new Random();
        int anInt = random.nextInt(5);
        int bnInt = random.nextInt(10);
        int cnInt = random.nextInt(20);

        a = anInt;
        b = bnInt;
        c = cnInt;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        if (a >= b && b >= c) {
            System.out.println("The biggest number " + a);
            System.out.println("The smallest number " + c);
        } else if (b >= a && a >= c) {
            System.out.println("The biggest number " + b);
            System.out.println("The smallest number " + c);
        } else if (c >= b && b >= a) {
            System.out.println("The biggest number " + c);
            System.out.println("The smallest number " + a);
        } else if (b >= c && c >= a) {
            System.out.println("The biggest number " + b);
            System.out.println("The smalles number " + a);
        } else if (a >= c && c >= b) {
            System.out.println("The biggest number " + a);
            System.out.println("The smalles number " + b);
        } else if (c >= a && a >= b) {
            System.out.println("The biggest number " + c);
            System.out.println("The smalles number " + b);
        }
    }
}
