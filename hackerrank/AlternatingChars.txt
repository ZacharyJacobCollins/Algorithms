import java.util.*;
public class Solution {
						//TODO make this work.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int operations = input.nextInt();
		Solution solution = new Solution();
		
		for(int i=0; i<operations; i++) {								//Does the operation for the amount of times asked
			String text = input.next();
			int length = text.length();
			char letter1 = GetLetter1(text);
			char letter2 = GetLetter2(text, letter1, length);	
			System.out.println(letter2);
			System.out.println(solution.FormatString(text, letter1, letter2, length));
		}
	}
	
	public static char GetLetter1(String text) {						//Gets the first char in entered string
		char letter1 = text.charAt(0);
		return letter1;
	}
	 
	public static char GetLetter2(String text, char letter1, int length) {				//Gets the second char in entered string
		for (int i=0; i<length; i++) {			
			if (letter1 != text.charAt(i)) {
				char letter2 = text.charAt(i);
				return letter2;
			}	
		}		
		return "e".charAt(0);
	}
	
	public String FormatString(String text, char letter1, char letter2, int length) {
		StringBuilder sb = new StringBuilder(text);
		int changes = 0;
		
		for (int i=0; i<length-1; i++) 
		{			
			if (sb.charAt(i)==(sb.charAt(i+1))) {				
				if (sb.charAt(i+1)==letter1) {
					sb.setCharAt(i, letter2);
				}
				if (sb.charAt(i+1)==letter2) {
					sb.setCharAt(i, letter1);
				}
			}			
			changes++;
		}	
		return sb.toString();
	}
}
