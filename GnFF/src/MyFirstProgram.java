import java.util.ArrayList;
import java.util.Scanner;

//The part that colors the output is ones such as "\u001B[35m" are ANSI color codes. It colors every subsequent output until told otherwise. the color code used here is as follows:
// "\u001B[35m" = Purple text
// "\u001B[33m" = Yellow text
// "\u001B[34m" = Blue text
// "\u001B[31m" = Red text
// "\u001B[32m" = Green text
// "\u001B[0m" = Default - "Turns off all ANSI attributes set so far."

public class MyFirstProgram {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); //Initializes scanner for input purposes
        String username;
        String userChoice;
        System.out.print("\033c"); //"\033c" clears everything in the terminal
        System.out.println("\u001B[35m" + "Wassup bruv");
        System.out.print("I should probably ask for your name. so, who are you? " + "\u001B[33m");
        username = scanner.next(); //Takes the user input and put it into username
        System.out.println(username + ", huh? Well nice to meet you, " + username + "!");

        ArrayList<String> fact = new ArrayList<String>(); // Reason for usage is outlined in the report
        fact.add("Today, Java rationally runs on more than 1 billion as the Android operating system of Google uses Java APIs.");
        fact.add("In one year Java gets downloaded one billion times.");
        fact.add("A Java developer's median salary is $83, 975.00. It pays to be a Java developer."); // nice try, buddy
        fact.add("In Java, The meaning of Final keyword is not final. It has different meanings in java. It can be Final class, Final method, Final field or Final variable.");
        fact.add("Java is the second most popular language and is very popular among the developers.");
        fact.add("Among the all-time most-played video games is Minecraft. The reason why its inventor, Notch, initially built the game in Java was that it was a programming language he was familiar with.");
        fact.add("Java's official mascot is named Duke, an arm-and-leg coffee cup figure.");
        // Sources for these has been included in the report.

        do {
            System.out.print("Would you like a fun fact? (" + "\u001B[34m" + "y" + "\u001B[33m" + "/" + "\u001B[31m" + "n" + "\u001B[33m" + ") ");
            userChoice = scanner.next();
            if (!(userChoice.equalsIgnoreCase("y")) && !(userChoice.equalsIgnoreCase("n"))) {
                userChoice = ""; //Sets the value to empty to continue the loop
                System.out.print("\033c");
                System.out.println("Please enter a proper answer");
            } // This section checks if the input is neither "y" nor "n", meaning invalid input.
            
        } while (userChoice.isEmpty()); //checks if the variable is still empty, meaning the input is still invalid

        if (userChoice.equalsIgnoreCase("y")) { //checks whether the user chose to see the facts
            while (userChoice.equalsIgnoreCase("y")) {
                // loops for as long as the user wants or until the list is empty
                if (fact.size() == 0) {
                    System.out.print("\033c");
                    System.out.println("\u001B[0m" + "Unfortunately, that's all the facts I have.\nbooting you out now...");
                    userChoice = "n"; //Breaks the loop
                // this part checks if the ArrayList is empty to avoid an error

                } else {
                    int index = (int) (Math.random() * fact.size()); // Math.random provides the randomizer for which fact is to be shown
                    System.out.print("\033c");
                    System.out.println("\u001B[32m" + fact.get(index)); //fetches the element chosen randomly to be shown
                    fact.remove(index); //removes the element to avoid repeating facts
                    System.out.print("Would you like another one? (" + "\u001B[34m" + "y" + "\u001B[32m" + "/" + "\u001B[31m" + "n" + "\u001B[32m" + ") ");
                    userChoice = scanner.next();
                }

                if (!(userChoice.equalsIgnoreCase("y")) && !(userChoice.equalsIgnoreCase("n"))) {
                    userChoice = "y"; //should there be a misinput, it'll default to y
                }
            }
        }
        System.out.print("\u001B[35m" + "\nbtw, the current java version in this computer is: " + System.getProperty("java.version") + "\u001B[0m"); // Extra feature that was requested
        scanner.close(); //Stops the scanner
    }
}
