import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//Take user input
		System.out.print("Enter a string: ");
        	String s = sc.nextLine();

		String res="";

		//reverse the original string and store in result string
		for(int i=s.length()-1;i>=0;i--){
			res+=s.charAt(i);
		}

		System.out.println("Reversed: "+res);
		
	}

}


/*
I/P -> capgemini
O/P -> inimegpac
*/
