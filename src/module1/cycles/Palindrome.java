package module1.cycles;

/**
 * Palindrome Main
 *
 * Version info 1
 *
 * Copyright Aleksandr Zharov KHNEU
 */
public class Palindrome {

    static String text = "A man, a plan, a canal – Panama";

    public static void main(String[] args) {
        String prettyText = text.trim().replaceAll("[^a-zA-Z0-9]","");
        int n = prettyText.length();
        String backwardsText = "";
        for(int i = n - 1; i >= 0; i--)
        {
            backwardsText = backwardsText + prettyText.charAt(i);
        }
        if(prettyText.equalsIgnoreCase(backwardsText))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
