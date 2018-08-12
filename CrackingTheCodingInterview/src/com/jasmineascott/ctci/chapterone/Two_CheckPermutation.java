package com.jasmineascott.ctci.chapterone;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 * TOPS, POTS, STPO, are all permutations of STOP
 * STOP has 4! permutations 
 * 		or 4 x 3 x 2 x 1 = 24 permutations
 * @author Jasmine
 * @version 8/12/2018
 */
public class Two_CheckPermutation {

	public static boolean isPermutationA(String str1, String str2) {
		
		//base case is to check that str1 length is equal to str2 length
		
		//iterate through str1
		//if char has not been added to map insert char and a count of 1
		//if char has been previously added to map increment count
		
		//iterate through str2
		//if char has not been added to map insert char and a count of 1
		//if char has been previously added to map decrement count
		
		//if any value in the map is greater than 0 the words are not permutations of each other
		
		return false;
	}
	
	//if assuming that chars are ASCII
	public static boolean isPermutationB(String str1, String str2) {
		
		//base case is to check that str1 length is equal to str2 length
		
		//iterate through str1
		//increment the count at the index for each char's ASCII value into an array
		
		//Iterate through str2
		//Decrement the count at the index for each char's ASCII value into an array

		//if any value in the array is not equal to zero then the strings are not permutations
		
		return false;
	}
	
	public static void main(String[] args) {
		String word1 = "pots";
		String word2 = "stop";
		System.out.println(word1 + ", " + word2 + " : " + isPermutationA(word1, word2));
	}
}
