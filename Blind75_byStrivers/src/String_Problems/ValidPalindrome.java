package String_Problems;
//Input: Str =  �ABCDCBA�

//Output: Palindrome

//Input: Str = �TAKE U FORWARD�
//Output: Not Palindrome
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;

		while (left < right) {
			if (!Character.isLetterOrDigit(s.charAt(left)))
				left++;
			else if (!Character.isLetterOrDigit(s.charAt(right)))
				right--;
			else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
				return false;
			} else {
				left++;
				right--;
			}
		}
		return true;
	}
}
