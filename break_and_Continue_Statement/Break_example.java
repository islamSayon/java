package break_and_Continue_Statement;

public class Break_example {public static void main(String[] args) {
    System.out.println("Break Statement Example");
    for(int i=1; i<=10; i++) {
        if(i==5) {
            break; // Exit the loop when i is 5
        }
        System.out.println("i: " + i);
}
    System.out.println("Loop terminated.");
}
}
