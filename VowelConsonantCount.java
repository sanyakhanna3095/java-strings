import java.util.Scanner;

public class VowelConsonantCount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		//Take user input
		System.out.print("Enter a string: ");
		String s=sc.nextLine().toLowerCase();
		//Count of vowels
		int cnt1=0;

		//Count of consonants
                int cnt2=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isLetter(ch)){
				if(isVowel(ch)){
					cnt1++;
				}
				else{
					cnt2++;
				}
			}
		}

		System.out.println("Number of vowels: " + cnt1);
        	System.out.println("Number of consonants: " + cnt2);
	}
	
	//Method to check if character is vowel or not
	public static boolean isVowel(char ch){
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			return true;
		}
		return false;
	}
	
}


/*
I/P -> Enter a string: abbystoimn45p  
O/P -> 
Number of vowels: 3
Number of consonants: 8

*/
