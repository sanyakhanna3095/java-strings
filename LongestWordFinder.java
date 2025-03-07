import java.util.Scanner;

public class LongestWordFinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        	//Take user input
        	System.out.print("Enter a string: ");
        	String s = sc.nextLine();
		
		// Find and display the longest word in the sentence
        	String longestWord = findLongestWord(s);
        	System.out.println("The longest word is: " + longestWord);
	}

	//method to find the word with maximum length
	public static String findLongestWord(String s){
		//handle empty strings or sring with null value
		if(s.length()==0 || s==null){
			return "";
		} 

		// Split the sentence into words
        	String[] words = s.split(" ");

		//Initialise a variable to store the result
		String res=words[0];

		for(int i=1;i<words.length;i++){
			if(words[i].length() > res.length()){
				res=words[i];
			}
		}
		return res;
	}

}



/*
I/P -> Welcome to bridgelab
O/P -> The longest word is: bridgelab
*/
