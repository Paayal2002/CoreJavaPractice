package controlFlowDay1;

public class CheckConsonantOrVowel {
	public static void main(String args[]) {
		char Letter='a';
		if(Letter=='a' || Letter=='e' || Letter=='i' || Letter=='o' || Letter=='u')
		{
			System.out.println("The Letter " +Letter+ " is the vowel ");
		}else {
			System.out.println("The Letter " +Letter+ " is the Consonant ");
		}
	}

}
