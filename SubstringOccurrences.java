import java.util.Scanner;

public class SubstringOccurrences {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input
        	System.out.println("Enter a string: ");
        	String s = sc.nextLine();

        	System.out.println("Enter the substring to find: ");
        	String sub = sc.nextLine();

        	// Call the method to count occurrences
        	System.out.println("Occurrences: " + countSubstringOccurrences(s, sub));
    	}

    	public static int countSubstringOccurrences(String str, String sub) {
        	int cnt = 0;
        	int idx = str.indexOf(sub); // Find first occurrence

        	// Keep searching until no more occurrences are found
		while ((idx = str.indexOf(sub, idx)) != -1) {
            		cnt++;
            		// Move the index ahead by the length of the substring
            		idx += sub.length(); 
        	}
        	return cnt;
    	}
}


/*
I/P -> Enter a string: helloworld hello world
Enter the substring to find: hello
O/P -> Occurences: 2
*/
