import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введитете трехзначное число");
        int a = sc.nextInt();

        int partOne = a/100;
        int partTwo = a%100/10;
        int partThree = a%10;

        if (partOne == partTwo && partTwo == partThree){
            System.out.println("Все цифры одиноковые");
        }
        else if (partOne == partTwo || partTwo == partThree || partOne == partThree){
            System.out.println("Одинаковые цифры есть");
        }
        else {
            System.out.println("Одинаковых цифр нет");
        }

    }
}
