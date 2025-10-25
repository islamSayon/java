import java.util.Scanner;
public class Day_Name {public static void main(String[] args) {

    System.out.println("---- Day Name And Number Cheaker ---- ");

    Scanner input = new Scanner(System.in);


    System.out.print(" Enter Day Number : ");
    int day = input.nextInt();

    switch (day) {

        case 1:
        System.out.println(day+" Number day is Saturday ");
            break;

            case 2:
        System.out.println(day+" Number day is Sunday ");
            break;

            case 3:
        System.out.println(day+" Number day is Monday ");
            break;

            case 4:
        System.out.println(day+" Number day is Tuesday ");
            break;

            case 5:
        System.out.println(day+" Number day is Wednesday ");
            break;

            case 6:
        System.out.println(day+" Number day is Thursday");
            break;

            case 7:
        System.out.println(day+" Number day is Friday ");
            break;
    
        default:
        System.out.println(" Invalid Day Number ");

            break;
    }

    input.close();
}
}
