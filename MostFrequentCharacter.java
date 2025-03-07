import java.util.Scanner;

public class MostFrequentCharacter {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Taking user input
        	System.out.println("Enter a string:");
        	String s = sc.nextLine();
        

        	// Calling method and print the most frequent character
        	char res = getMostFrequentCharacter(s);
        	System.out.println("Most frequent character: " + res);
    	}

    	public static char getMostFrequentCharacter(String s) {
        	int[] freq = new int[256]; 
        	int maxFreq = 0;
        	char mostFrequentChar = ' ';

        	// Count frequency of each character
        	for (int i = 0; i < s.length(); i++) {
            		char ch = s.charAt(i);
            		freq[ch]++; 
            
            		// Update most frequent character
            		if (freq[ch] > maxFreq) {
                		maxFreq = freq[ch];
                		mostFrequentChar = ch;
            		}
        	}

        	return mostFrequentChar;
    	}
}
