import java.util.Scanner;
public class Switch {public static void main(String[] args) {

    System.out.println("---- Day Name And Number Cheaker ---- ");

    Scanner input = new Scanner(System.in);


    System.out.print(" Enter Day Number : ");
    String day = input.nextLine();

    switch (day) {

        case "1st":
        System.out.println(day+" Number day is Saturday ");
            break;

            case "2nd":
        System.out.println(day+" Number day is Sunday ");
            break;

            case "3rd":
        System.out.println(day+" Number day is Monday ");
            break;

            case "4th":
        System.out.println(day+" Number day is Tuesday ");
            break;

            case "5th":
        System.out.println(day+" Number day is Wednesday ");
            break;

            case "6th":
        System.out.println(day+" Number day is Thursday");
            break;

            case "7th":
        System.out.println(day+" Number day is Friday ");
            break;
    
        default:
        System.out.println(" Invalid Day Number ");

    }

    input.close();
}
}

