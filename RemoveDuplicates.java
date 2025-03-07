import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	//Take user input
        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	// Calling the method to remove duplicates and printing the result
        	String res = removeDuplicates(s);
        	System.out.println("String after removing duplicates: " + res);
    	}

    	// Method to remove duplicate characters from a string
    	public static String removeDuplicates(String s) {
        	// String to store the result without duplicates
        	String res = "";

        	// Loop through each character in the given string
        	for (int i = 0; i < s.length(); i++) {
            		char curr = s.charAt(i);

            		// Check if the character is not already present in the result
            		if (res.indexOf(String.valueOf(curr)) == -1) {
                		// If not present, append it to the result
                		res += curr;
            		}
        	}
        	return res;
    	}
} 



/*
I/P -> aasbhbat
O/P -> String after removing duplicates: asbht
*/
