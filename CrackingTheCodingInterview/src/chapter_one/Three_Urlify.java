package chapter_one;

/**
 * Problem: Write a method to replace all spaces in a string with '%20 You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.) EXAMPLE Input: "Mr John Smith     ", 13 Output:
 * "Mr%20John%20Smith"
 * 
 * @author Jasmine
 * @version 8/20/2018
 *
 */
public class Three_Urlify {

	public static String urlify(String str) {
		
		//count the spaces in the string
		int numOfSpaces = 0;
		for (char c : str.toCharArray()) {
			if (c == ' ') numOfSpaces++;
		}
		
		/*  
		 	the array needs to be the string length + 2 * number of spaces
			multiply by 2 because there are three characters in '%20' 
			1 char will be occupied by the blank
			the other 2 will need additional space  
		*/
		char[] array = new char[str.length() + 2*numOfSpaces];
		
		//iterate through the array and if it is a space add '%20' using an arrayIndex stepper
		int arrayIndex = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') { 
				array[arrayIndex] = str.charAt(i);
				arrayIndex++;
			}
			else if (str.charAt(i) == ' ') { 
				array[arrayIndex] = '%';
				array[arrayIndex+1] = '2';
				array[arrayIndex+2] = '0';
				arrayIndex = arrayIndex + 3;
			}
		}
		return String.valueOf(array);
	}
	
	public static void main(String[] args) {
		System.out.println(urlify("Mr John Smith"));
	}
}
