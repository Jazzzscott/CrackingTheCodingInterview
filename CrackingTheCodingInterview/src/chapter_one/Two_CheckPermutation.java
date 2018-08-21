package chapter_one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 * TOPS, POTS, STPO, are all permutations of STOP
 * STOP has 4! permutations 
 * 		or 4 x 3 x 2 x 1 = 24 permutations
 * @author Jasmine
 * @version 8/20/2018
 */
public class Two_CheckPermutation {

	//utilizes extra memory by using a Map
	public static boolean isPermutationA(String str1, String str2) {
		
		Map<Character, Integer> permMap = new HashMap<Character, Integer>();
		
		//base case is to check that str1 length is equal to str2 length
		if (str1.length() != str2.length()) return false;
		
		//iterate through str1
		for (char c : str1.toCharArray()) {
			//if char has not been added to map insert char and a count of 1
			if (!permMap.containsKey(c)) permMap.put(c, 1);
			//if char has been previously added to map increment count
			else if (permMap.containsKey(c)) permMap.put(c, permMap.get(c) +1);
		}
		
		//iterate through str2
		for (char c : str2.toCharArray()) {
			//if char has not been added to map then it is not a permutation
			if (!permMap.containsKey(c)) return false;
			//if char has been previously added to map decrement count
			else if (permMap.containsKey(c)) permMap.put(c, permMap.get(c) -1);
		}

		//if any value in the map is greater than 0 the words are not permutations of each other
		for (Character value : permMap.keySet()) {
			if (permMap.get(value) != 0) return false;
		}
		
		return true;
	}
	
	//without utilizing extra memory
	public static boolean isPermutationB(String str1, String str2) {

		//base case is to check that str1 length is equal to str2 length
		if (str1.length() != str2.length()) return false;
				
		//Sort the strings alphabetically
		String temp1 = sortString(str1);
		String temp2 = sortString(str2);
		
		//return true if the strings are equal or false if not equal
		return temp1.equals(temp2);
	}
	
	public static String sortString (String str) {
		char[] temp = str.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
	
	public static void main(String[] args) {
		String word1 = "pots";
		String word2 = "stol";
		System.out.println(word1 + ", " + word2 + " : " + isPermutationB(word1, word2));
	}
}
