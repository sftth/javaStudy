package javaStudy.test2017.e17.q1;

public class WordCount {
	public static int countWord(String message, String searchWord) {
		int count = 0;
		String[] words = message.split(" ");
		for(String word: words) {
			if(searchWord.equals(word)) {
				count++;
			}
		}
		return count;
	}
}
