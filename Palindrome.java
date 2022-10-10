class Palindrome {
  
  public static boolean isPalindromeRecursively(String input) {
    // If the input is an empty string or a single character
    if (input.length() == 0 || input.length() == 1) {
      return true;
    }
    // Comparing the first character with the last; if equal recursively call the method on the substring.
    if(input.charAt(0) == input.charAt(input.length-1)){
      return isPalindromeRecursively(input.subString(1, input.length()-1));
    }
    // Not a palindrome.
    return false;
  }
  
  public static boolean palindromeIter(String input) {
		int start = 0;
		int end = input.length() -1;
		
		while(start <= end) {
			if (input.charAt(start) == input.charAt(end)) {
				start ++;
				end --;
			}
			else {
				return false;
			}
		}
		return true;
	}
  	public static void main(String[] args) {
		String pal = "tattarrattat";
		boolean isPalindrome = isPalindromeRecursively(pal);
		System.out.println(isPalindrome);
	}
}
