import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	// Take user input 
        	System.out.println("Enter the sentence: ");
        	String s = sc.nextLine();

        	// Take user input for word to replace and new word
        	System.out.println("Enter the word to replace: ");
        	String oldWord = sc.next();

        	System.out.println("Enter the new word: ");
        	String newWord = sc.next();

        	// Replace the word in the sentence and store the updated sentence
		String res=replaceWord(s, oldWord, newWord);
        
        	// Print the result
        	System.out.println("Updated sentence: " + res);
    	}
	
	// Method to replace a word in the sentence
    	public static String replaceWord(String sentence, String oldWord, String newWord) {
        	// Replacing the word using the replaceAll method
        	return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    	}
}


/*
I/P -> Enter the sentence: Welcome to bridgelab
Enter the word to replace: bridgelab
Enter the new word: capgemini
O/P -> Updated sentence: Welcome to capgemini
*/
