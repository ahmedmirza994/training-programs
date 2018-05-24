package KeywordsAndExpressions;

public class RegularExpressions {
	public static void main(String[] args) {
		String string = "I am a string. Yes, I am.";
		System.out.println(string);
		String yourString = string.replace("I","You");
		System.out.println(yourString);

		String alphanumeric = "abcsdEEDasd123dAdsd";
		System.out.println(alphanumeric.replaceAll(".", "Y"));

		System.out.println(alphanumeric.replaceAll("^abcsd", "YYY"));

		String secondalphanumeric = "abcsdEEDasd123dAdsdabcsdEE";
		System.out.println(secondalphanumeric.replaceAll("^abcsd", "YYY"));

	}
}
