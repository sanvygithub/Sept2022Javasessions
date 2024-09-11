
public class CountCharacterOccurenceInString {

	public static void main(String[] args) {
		
		permutation("abc", "");

	}

	public static void permutation(String input, String result) {

		if (input.length() == 0) {
			System.out.println(result + " ");
			return;

		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			String rest = input.substring(0, i) + input.substring(i + 1);
			
			permutation(rest,result+ch);

		}
	}

}
