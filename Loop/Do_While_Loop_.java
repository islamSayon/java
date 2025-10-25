package Loop;
import java.util.Scanner;
public class Do_While_Loop_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        int i = input.nextInt();

        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);

        input.close();
    }

}
