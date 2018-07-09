package javaStudy.test2017.e03.q4;

public class SourceAnalyzerRun {
	public static void main(String[] args) {
		//1.
		int fileCount = SourceAnalyzer.getJavaFileCount();
		int problemFileCount = SourceAnalyzer.getProblemFileCount();
		int totalLineCount = SourceAnalyzer.getTotalLineCount();
		int patternCount = SourceAnalyzer.getPatternCount();
		
		System.out.println("전체 소스 개수: " + fileCount);
		System.out.println("소스 전체 Line 수: " + totalLineCount);
	}
}
