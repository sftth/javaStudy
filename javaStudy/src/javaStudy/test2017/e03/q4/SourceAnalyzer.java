package javaStudy.test2017.e03.q4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class SourceAnalyzer {
	//파일 객체
	final static String path ="/Users/Summit/IDE/workspace/studyJava/src/studyJava/TCT/T201703E/Q4/resource/sourceAnalyzer";
	String pattern = "public void remove() {removeDescending();}";
	
	public static int getJavaFileCount() {
		File[] fileList = getFileList(path);

		int count = 0;
		String ext = "";
		String fileName = "";
		for(File file : fileList) {
			fileName = file.getName();
			ext = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			if(file.isFile() && ".java".equals(ext)) {
				count++;
			}
		}
		return count;
	}
	
	public static int getProblemFileCount() {
		File[] fileList = getFileList(path);
		for(File file : fileList) {
			
		}
		return 0;
	}
	
	public static int getTotalLineCount() {
		int count = 0;
		File[] fileList = getFileList(path);
		for(File file : fileList) {
			List<String> lines = readFile(file);
			count += lines.size();
		}
		return count;
	}
	
	public static int getPatternCount() {
		return 0;
	}
	
	public static List<String> readFile(File file) {
		List<String> raws = new LinkedList<String>();
		try {
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while((line = bufReader.readLine()) != null) {
				System.out.println(line);
				raws.add(line);
			}
			bufReader.close();
		} catch(Exception e) {
			System.err.println(e);
		}
		return raws;
	}
	
	public static File[] getFileList(String path) {
		File dirFile = new File(path);
		File[] fileList = dirFile.listFiles();
		return fileList;
	}
}
