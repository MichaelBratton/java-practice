package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(sentence);
		System.out.println(withNoSpaces);
		String x = sentence.replace(",", "!!!");
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "").replace("$", "").replace("-", "").replace("|", "").replace("@#", "");

		System.out.println(mixed);
        //show only number of results
		String result = "About 115,000,000 results (0.42 seconds)";
        result = result.replace("About ", "");
        String fS = result.substring(result.indexOf(" "));
        result = result.replace(fS, " ");     
        System.out.println(result);
	}
}
