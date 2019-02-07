import java.util.Scanner;

public class TextMsgExpander {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userLine;

        // Prompt user for text
        System.out.println("Enter text:");
        userLine = scnr.nextLine();
        System.out.println("You entered: " + userLine);
        System.out.println("");

        // Check for abbreviations
        if (userLine.indexOf("BFF") != -1) {
            userLine = userLine.replace("BFF", "best friend forever");
        }
        if (userLine.indexOf("IDK") != -1) {
            userLine = userLine.replace("IDK", "I don't know");
        }
        if (userLine.indexOf("JK") != -1) {
            userLine = userLine.replace("JK", "just kidding");
        }
        if (userLine.indexOf("TMI") != -1) {
            userLine = userLine.replace("TMI", "too much information");
        }
        if (userLine.indexOf("TTYL") != -1) {
            userLine = userLine.replace("TTYL", "talk to you later");
        }

        //can use input "You're my BFF but IDK if that was TMI or not.. JK!! I'll TTYL!"
       

        // Output expanded text
        System.out.println("");
        System.out.println("Expanded: " + userLine);
    }
}