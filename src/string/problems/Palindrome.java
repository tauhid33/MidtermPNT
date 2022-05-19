package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        System.out.println("Please Enter a string: ");

        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        boolean isPalindrome = true;

        //check if ith character is same from start and end
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        //check if str is palindrome
        if (isPalindrome) {
            System.out.println(str + " is Palindrome.");
        } else {
            System.out.println(str + " is not Palindrome.");
        }
    }
}
