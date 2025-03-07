import java.util.Scanner;

public class LexicographicalComparison {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking input from the user
        	System.out.print("Enter first string: ");
        	String s1 = sc.nextLine();

        	System.out.print("Enter second string: ");
        	String s2 = sc.nextLine();

        	// Comparing the two strings
        	int result = compareStrings(s1, s2);

        	// Displaying the result
        	if (result < 0) {
			System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order.");
        	} 
        	else if (result > 0) {
			System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order.");
        	} 
        	else {
            		System.out.println("Both strings are equal.");
        	}
    	}

    	// Method to compare two strings lexicographically without using built-in methods
    	public static int compareStrings(String s1, String s2) {
        	int len1 = s1.length();
        	int len2 = s2.length();
        	int minLength = Math.min(len1, len2);

        	// Comparing characters one by one
		for (int i = 0; i < minLength; i++) {
            		if (s1.charAt(i) < s2.charAt(i)) {
                		// string1 comes first
                		return -1;  
            		} 
            		// string2 comes first
            		else if (s1.charAt(i) > s2.charAt(i)) {
                		return 1;  
            		}
            		else{
				//Strings are equal
                		return 0;
            		}
        	}

        	// If all characters are the same up to the length of the shortest string, compare lengths
        	if (s1.length() < s2.length()) {
            		return -1;  
        	} 
        	else if (s1.length() > s2.length()) {
            		return 1;   
        	}
        	// strings are equal
        	return 0;  
		
    	}
}


