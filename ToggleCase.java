import java.util.Scanner;

public class ToggleCase {
	public static void main(String[] args) {
       		Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.println("Enter a string:");
        	String s = sc.nextLine();

	        // Call method to toggle case
        	System.out.println("Toggled String: " + toggleCase(s));
    	}

    	public static String toggleCase(String str) {
        	StringBuilder sb = new StringBuilder();

        	// Loop through each character
        	for (int i = 0; i < str.length(); i++) {
            		char ch = str.charAt(i);

            		// Check if character is uppercase, then convert to lowercase and vice versa
            		if (Character.isUpperCase(ch)) {
                		sb.append(Character.toLowerCase(ch));
            		} 
			else {
                		sb.append(Character.toUpperCase(ch));
            		}
        	}

        	return sb.toString();
    	}
}


/*
I/P -> HeLLo WORld
O/P -> Toggled String: HEllO worLD
*/
