import java.util.ArrayList;
import java.util.Scanner;
public class MyFirstProgram {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String username;
        String userChoice;
        System.out.print("\033c");
        System.out.println("\u001B[35m" + "Wassup bruv");
        System.out.print("I should probably ask for your name. so, who are you? " + "\u001B[33m");
        username = scanner.next();
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
                userChoice = "";
                System.out.print("\033c");
                System.out.println("Please enter a proper answer");
            }
        } while (userChoice.isEmpty());
        if (userChoice.equalsIgnoreCase("y")) {
            while (userChoice.equalsIgnoreCase("y")) {
                if (fact.size() == 0) {
                    System.out.print("\033c");
                    System.out.println("\u001B[0m" + "Unfortunately, that's all the facts I have.\nbooting you out now...");
                    userChoice = "n";
                } else {
                    int index = (int) (Math.random() * fact.size());
                    System.out.print("\033c");
                    System.out.println("\u001B[32m" + fact.get(index));
                    fact.remove(index);
                    System.out.print("Would you like another one? (" + "\u001B[34m" + "y" + "\u001B[32m" + "/" + "\u001B[31m" + "n" + "\u001B[32m" + ") ");
                    userChoice = scanner.next();
                }
            }
        }
        System.out.print("\u001B[35m" + "\nbtw, the current java version in this computer is: " + System.getProperty("java.version") + "\u001B[0m");
        scanner.close();
    }
}
