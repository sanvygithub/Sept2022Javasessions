package javaassignments;

public class InterviewPrograms {

	public static void main(String[] args) {

		String str = "I mA naidnI";
		String[] words = str.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			String word = words[i];
			StringBuilder sb1 = new StringBuilder();
			for (int j = word.length() - 1; j >= 0; j--) {

				sb1.append(word.charAt(j));

			}
			sb.append(sb1).append(" ").toString();

		}
		System.out.println(sb);

//		String st = "";
//		for (int i = str.length() - 1; i >=0; i--) {
//			st = st + str.charAt(i);
//
//		}
//		System.out.println(st);

	}

}
