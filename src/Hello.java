import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

        // Creating scanner for user input
        Scanner scnr = new Scanner(System.in);
        // Pre-expressing all my scanner variables for organization purposes
        String name;
        String age;
        String home;

        /* Print question without a 'new line' so that the answer is pasted to the
            right of the question.*/
        System.out.print("Hello. What is your name? ");
        /* The next code allows the user to input their 'name' and so on, using the
            previously established scanner variables */
        name = scnr.next();
        System.out.print("It's nice to meet you, " + name + ". How old are you? ");
        age = scnr.next();
        System.out.println("I see that you are still quite young at only " + age + ".");
        System.out.print("Where do you live? ");
        home = scnr.next();
        System.out.println("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");
        //random comment for git hub?
    }
}
