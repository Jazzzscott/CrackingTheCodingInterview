package chapter_one;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * @author Jasmine
 * @version 8/12/2018
 */
public class One_IsUnique {

	//uses a set to hold unique values
	public static boolean isUniqueA(String str1) {
		
		Set<Character> charSet = new HashSet<Character>();
		char[] charArray = str1.toCharArray();
		
		//iterate through the char array
		for (char c : charArray) {
			//insert each char into the set
			charSet.add(c);
		}
		
		//if the set length and the string length are equal then it is unique
		if (charSet.size() == str1.length()) return true;
		
		return false;
		
	}
	
	
	//assumes that ASCII values are ok
	public static boolean isUniqueB(String str1) {

		char[] charArray = str1.toCharArray();
		int[] tracker = new int[256];
		
		//iterate through string
		for (int i = 0; i < str1.length(); i++) {
			//if value at ASCII index is greater than 0, the character existed before so it is not unique
			if (tracker[str1.charAt(i)] > 0) return false;
			// else just increment the value for the first time
			tracker[str1.charAt(i)]++;
		}
		return true;
	}
	
	public static void main (String[] args) {
		
		String[] words = {"balloon", "peanut", "string", "check"}; //false, true, true, false
		
		for (String word : words ) {
			System.out.println(word + " : " + isUniqueA(word));
			System.out.println(word + " : " + isUniqueB(word));
			System.out.println();
		}
	}
}
