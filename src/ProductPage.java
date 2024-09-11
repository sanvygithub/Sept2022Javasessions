import java.util.Arrays;

public class ProductPage {

	public static void main(String[] args) {
		String s = "Learning Automation Selenium Using Java";
		String ch[] = s.split(" ");

		// System.out.println(Arrays.toString(ch));

		char c = ' ';

		for (int i = 0; i < ch.length; i++) {
			String words = ch[i];

			for (int j = 0; j < words.length(); j++) {
				c = words.charAt(0);

			}
			System.out.print(c);

		}
		

	}

}
