package com.jasmineascott.ctci.chapterone;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 * @author Jasmine
 * @version 8/12/2018
 */
public class One_IsUnique {

	//uses a set to hold unique values
	public static boolean isUniqueA(String str1) {
		
		//iterate through the char array
		//insert each char into the set
		
		//if the set length and the string length are equal then it is unique
		
		return false;
		
	}
	
	
	//assumes that ASCII values are ok
	public static boolean isUniqueB(String str1) {

		//iterate through the char array for the string
		//use an int array to increment the count at each index for the ASCII associated with each char
		
		//iterate throught the int array
		//if any of the values is greater than one then the string is not unique 
		
		return false;
	}
	
	public static void main (String[] args) {
		
		String[] words = {"balloon", "peanut", "string", "check"}; //false, true, true, false
		
		for (String word : words ) {
			System.out.println(word + " : " + isUniqueA(word));
			System.out.println(word + " : " + isUniqueB(word));
		}
	}
}
