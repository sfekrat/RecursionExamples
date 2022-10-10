public class StringReverse {
  // main method
	public static void main(String[] args) {
		String rev = reverseStr("Hello, I am a string.");
		System.out.println(rev);
		rev = recursiveStringReverse(rev);
		System.out.println(rev);
	}
  // Reverses a string iteratively.
	public static String reverseStr(String str) {
		char[] CharsInstr = str.toCharArray();
		StringBuilder revStr = new StringBuilder();
		for (int i = CharsInstr.length -1 ; i >= 0; i--) {
			revStr.append(CharsInstr[i]);
		}
		return "" + revStr;
	}
	// Reverses a string recursively. 
	public static String recursiveStringReverse(String input) {
		// What is the base case?
		if (input.equals("")) {
			return "";
		}
		// What is the smallest amount of work I can do in each iteration?
		return recursiveStringReverse(input.substring(1)) + input.charAt(0);
	}
}
