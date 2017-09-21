import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the month from 1 to 12");

        int month = sc.nextInt();
        String season;

        switch (month) {
            case 1: season = "Winter";
            break;
            case 2: season = "Winter";
            break;
            case 3: season = "Spring";
            break;
            case 4: season = "Spring";
            break;
            case 5: season = "Spring";
            break;
            case 6: season = "Summer";
            break;
            case 7: season = "Summer";
            break;
            case 8: season = "Summer";
            break;
            case 9: season = "Autumn";
            break;
            case 10: season = "Autumn";
            break;
            case 11: season = "Autumn";
            break;
            case 12: season = "Winter";
            break;
            default: season = "Not a month";
            break;
        }
        System.out.println(season);
    }
}