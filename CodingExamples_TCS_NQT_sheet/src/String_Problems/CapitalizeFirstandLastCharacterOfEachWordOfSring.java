package String_Problems;

/*Example 1:
Input: String str = "take u forward is awesome"
Output: �TakE U ForwarD IS AwesomE�*/


/*Approach:

Keep on iterating the given string:
Convert first and last index character to uppercase if initially the string character is in lowercase 
Convert the characters present before and after �space� to uppercase
if initially the string character is in lowercase 
Return the final string*/

/*Things to note:

(int) str[i] gives the ASCII value of the ith string character 
((int) str[i] � 32) gives the ASCII value of the Capitalized ith string character 
(char)((int) str[i] � 32) converts the ASCII value to its corresponding character
In Java , the StringBuffer class is used to create mutable (modifiable) strings.*/

public class CapitalizeFirstandLastCharacterOfEachWordOfSring {
	public static String Capitalize(String str, int size) {
	    StringBuffer sb = new StringBuffer(str);

	    for (int i = 0; i < size; i++) {
	      if (i == 0 || i == (size - 1) && (int) str.charAt(i) >= 97) //Converting first
	      //and last index character to uppercase
	      {
	        sb.setCharAt(i, (char)((int) str.charAt(i) - 32));
	      } else if (str.charAt(i) == ' ') // Converting characters present before and
	      //after space to uppercase
	      {
	        if (((int) str.charAt(i - 1) - 32) >= 65) // Already not an uppercase letter
	          sb.setCharAt(i - 1, (char)((int) str.charAt(i - 1) - 32));

	        if (((int) str.charAt(i + 1) - 32) >= 65) // Already not an uppercase letter
	          sb.setCharAt(i + 1, (char)((int) str.charAt(i + 1) - 32));
	      }
	    }

	    return sb.toString();
	  }
	  public static void main(String args[]) {
	    String str = "take u forward is awesome";
	    int size = str.length();

	    System.out.println("String after capitalizing the first and last letter of each word of the string: ");
	    System.out.println(Capitalize(str, size));
	  }
}
