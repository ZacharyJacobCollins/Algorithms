import java.util.*;
public class FunnyString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int operations = input.nextInt();
		
		for (int i=0; i<operations; i++) {
			System.out.println(check(input.next()));
			}
	}
	
	public static String check(String s){
		int length = s.length();
		StringBuilder sb = new StringBuilder(s);
		String r = sb.reverse().toString();
		
		for (int i=0; i<length; i++) {
			if (((int) s.charAt(i))-((int) s.charAt(i+1)) != ((int) r.charAt(i))-((int) r.charAt(i+1))) {
				return "not funny";
			}
		}
		return "funny";
	}
}


