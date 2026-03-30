package Method;

public class Palindrome {
	
	
	void checkPalindrome(int num) {
        int original = num;
        int reverse = 0;

        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse)
            System.out.println(original + " is Palindrome");
        else
            System.out.println(original + " is Not Palindrome");
    }
}

		
	


