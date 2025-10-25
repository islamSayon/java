package Loop;
import java.util.Scanner;

public class While_loop { public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print(("Enter any number : "));
    int i = input.nextInt();

    while (i<=5) {
        System.out.println("Your Number : " +i );
        i++;
        
    }
    input.close();

}
    
}
