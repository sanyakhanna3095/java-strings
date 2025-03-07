import java.util.Scanner;

public class PalindromeCheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//Take user input
		System.out.print("Enter a string: ");
        	String s = sc.nextLine();

		//check if string is palindrome or not using function
		if(isPalindrome(s)){
			System.out.println("YES, a palindrome");
		}
		else{
			System.out.println("NO, not a palindrome");
		}
	}
	
	//method to check if string is plaindrome or not
	public static boolean isPalindrome(String s){
		for (int i = 0; i < s.length() / 2; i++) {
            		if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
	         		return false;   
			}
        	}
		return true;
	}

}


/*
I/P -> abba
O/P -> YES, a palindrome
*/
