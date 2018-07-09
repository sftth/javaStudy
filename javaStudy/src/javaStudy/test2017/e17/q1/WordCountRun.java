package javaStudy.test2017.e17.q1;

public class WordCountRun {
	public static void main(String[] args) {
		String message = "I LOVE LG I LOVE CNS";
		String searchWord = "I";
		int count = WordCount.countWord(message, searchWord);
		
		System.out.println("입력된 문자열: " + message);
		System.out.println("검색 단어: " + searchWord);
		System.out.println("빈도 수: " + count);
	}
}
