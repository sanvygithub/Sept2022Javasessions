package javaassignments;

public class InterviewStringAssignments {

	public static void main(String[] args) {

//		String s = "Try Reverse String";
//		String[] s1 = s.split(" ");
//
//		StringBuilder sb = new StringBuilder();
//		for (String s2 : s1) {
//			StringBuilder sb3 = new StringBuilder(s2);
//			StringBuilder reversed = sb3.reverse();
//			sb.append(reversed).append(" ");
//			// sb.reverse();
//		}
//		System.out.println(sb.toString().trim());

		String input = "Try Reverse String";
		String[] words = input.split(" "); // Try Reverse String
		StringBuilder reversed = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) { // i=2
			String word = words[i];// String
			StringBuilder reversedword = new StringBuilder();
			for (int j = word.length() - 1; j >= 0; j--) {
				reversedword.append(word.charAt(j));
			}
			reversed.append(reversedword).append(" ").toString().trim();
		}

		System.out.println("Reversed String :" + reversed);

	}

}
