import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking input from the user
        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();

        	System.out.print("Enter the character to remove: ");
        	char ch = sc.next().charAt(0);

        	// Removing the specified character and storing the modified string
        	String res = removeCharacter(s, ch);

        	// Displaying the modified string
        	System.out.println("Modified String: " + res);
    	}

    	// Method to remove all occurrences of a specific character from a string
    	public static String removeCharacter(String s, char ch) {
        	String res = "";

        	// Looping through the string and appending characters that aren't the target character
        	for (int i = 0; i < s.length(); i++) {
            		if (s.charAt(i) != ch) {
                		res += s.charAt(i);
            		}
        	}

        	return res;
    	}
} 


/*
I/P -> Enter a string: Hello World
Enter the character to remove: l

O/P -> Modified String: Heo Word
*/
