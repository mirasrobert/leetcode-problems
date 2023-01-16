import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

		System.out.println(firstNonRepeatingChar("stress"));

		System.out.println(isPalindrome("level"));


		System.out.println(highestNumber());

		System.out.println(reverseWords("Hello World"));
    }

    
    public static char firstNonRepeatingChar(String s) {
        

		// Bruteforce
       for (int i = 0; i < s.length(); i++) {

			boolean seenDuplicate = false;

			for (int j = 0; j < s.length(); j++) {


				// Check if same character
				if(s.charAt(i) == s.charAt(j) && (i != j)) {
					seenDuplicate = true;
					break;
				}

			}

			if (!seenDuplicate) {
				// early return if no duplicate
				return s.charAt(i);
			}

	   }

	   // No Non Repeating 
	   return '_';

        
    }

	public static boolean isPalindrome(String s) {
		
		// racecar

		int frontIndex = 0;

		int backIndex = s.length() - 1;

		while (frontIndex < backIndex) {
			
			if (s.charAt(frontIndex) != s.charAt(backIndex)) {
				return false;
			}

			frontIndex++;
			backIndex--;

		}

		return true;

	}

	public static int highestNumber() {
		

		int[] numbers = {1, 3, 5, 8, 3, 0};

		int currentMaxNumber = numbers[0];

		for (int i = 0; i < numbers.length; i++) {


			if(numbers[i] > currentMaxNumber) {
				currentMaxNumber = numbers[i];
			}



		}

		
		return currentMaxNumber;


	}

	public static String reverseWords(String sentence) {

		String[] words = sentence.split(" ");

		String reversed = "";

		for (int i = words.length - 1; i >= 0; i--) {
		  reversed = reversed + words[i] + " ";
		}

		return reversed.trim();

	  }
}