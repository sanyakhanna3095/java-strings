import java.util.Scanner;
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        // Checking if the strings are anagrams
        if (areAnagrams(s1, s2)) {
            System.out.println("YES, The strings are anagrams.");
        } 
        else {
            System.out.println("NO, The strings are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String s1, String s2) {
        // If lengths are not equal, they can’t be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }
} 


/* 
I/P -> abba
baaa
O/P -> The strings are not anagrams.
*/
