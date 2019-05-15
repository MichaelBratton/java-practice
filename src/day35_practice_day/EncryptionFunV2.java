package day35_practice_day;

import java.util.*;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a sentence to encrypt:");

		String sentence = scan.nextLine();
		System.out.println(encryptSentence(sentence));
	}

	public static char encryptChar(char character) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "kjihgfedcbazyxwvutsrqponml";
		return encrypted.charAt(alphabet.indexOf(character));

	}

	public static String encryptWord(String word) {
		String encrypted = "";
		for (int i = 0; i < word.length(); i++) {
			encrypted += encryptChar(word.charAt(i));
		}
		return encrypted;
	}

	public static String encryptSentence(String sentence) {
		String result = "";
		String[] sent = sentence.split(" ");
		for (int i = 0; i < sent.length; i++) {
			result += encryptWord(sent[i])+" ";
		}
		return result.trim();
	}

}
