// প্রথমে Java এর প্যাকেজ import করছি যাতে আমরা user input নিতে পারি।
import java.util.Scanner;

// প্রতিটি Java প্রোগ্রাম শুরু হয় একটি class থেকে।
public class User_Input_Example {

// main method হল প্রোগ্রামের entry point — এখান থেকেই execution শুরু হয়।
public static void main(String[] args) {
        
 // Scanner হলো Java-এর একটি built-in class — এটা দিয়ে আমরা keyboard থেকে input নিতে পারি।
// এখানে 'user_input' হলো একটি নাম (variable নাম), এটা আমরা নিজের মতো করে দিতে পারি।
// new Scanner(System.in) মানে হচ্ছে — নতুন একটি Scanner object তৈরি করো যেটা system input (keyboard) থেকে ডেটা নেবে।
        Scanner user_input = new Scanner(System.in);


// এখানে আমরা একটি String টাইপের ভ্যারিয়েবল ঘোষণা করছি, যেখানে শব্দ বা বাক্য (name) রাখা হবে।
        System.out.print("enter your full name:"); // এখানে user কে দেখানো হচ্ছে “Enter your name: ”
        String name= user_input.nextLine();        //ইনপুট নিচ্ছি, nextLine() কারণ name শব্দ বা বাক্য হতে পারে।

// এখানে আমরা একটি integer টাইপের ভ্যারিয়েবল ঘোষণা করছি, যেখানে পূর্ণ সংখ্যা (age) রাখা হবে।
        System.out.print("enter your age:"); // এখানে user কে দেখানো হচ্ছে “Enter your age: ”
        int age= user_input.nextInt();        // ইনপুট নিচ্ছি, nextInt() কারণ age পূর্ণ সংখ্যা হতে পারে।

// এবার একটা double টাইপের ভ্যারিয়েবল নিচ্ছি ২ দশমিক মান(GPA) রাখার জন্য।
        System.out.print("enter your cgpa:"); // এখানে user কে দেখানো হচ্ছে “Enter your cgpa: ”
        double cgpa= user_input.nextDouble();  // এখানে ইনপুট নিচ্ছি — nextDouble() কারণ GPA দশমিক সংখ্যা হতে পারে।



// এখন ইনপুট নেয়া ডেটা প্রিন্ট করছি — output screen এ দেখাবে।
        System.out.println("your name is " +name);
        System.out.println("your age is " + age);
        System.out.println("your cgpa is " + cgpa);



        user_input.close();  // কাজ শেষে Scanner বন্ধ করা ভালো প্র্যাকটিস।
}
}