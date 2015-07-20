import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		Scanner input = new Scanner(System.in);
		
		System.out.println(solution.Check((solution.Format(input.nextLine()))));
	}
	
	public String Format(String s) {
		s = s.toLowerCase();
		s = s.replaceAll("\\s+","");
		return s;
	}
	
	public String Check(String s) {
	    Set<Character> alphabet = new HashSet<>();
	    char[] sentence = s.toCharArray();
	    
		for (int i=0; i<26; i++) {
			alphabet.add("abcdefghijklmnopqrstuvwxyz".charAt(i)); 
		}
		
		for (char letter : sentence) {
			if (alphabet.contains(letter)) {
				alphabet.remove(letter);
			}
		}
		
		if (alphabet.isEmpty()) {
			return "pangram";
		}
		
		else if (!alphabet.isEmpty()) {
			return "not pangram";
		}
		
		return "error";
	}
}
