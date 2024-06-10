package in.co.rays.javabasic;

public class VowelCount {
	public static void main(String[] args) {

		String name = "abcd";
		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}
		}
		System.out.println("vowel = " + count);
	}
}
