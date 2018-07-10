package javaStudy.test2017.e17.q3;

public class MacAddressRun {
	public static void main(String[] args) {
		String input1 = "01:23:45:67:89:ab";
		String input2 = "0123.AbcD.Ef99";
		String input3 = "78-90-AB-CD-EF-AH";
//		String input3 = "78123123123213132";
		
		String result = MacAddress.validateMacAddress(input3);
	System.out.println(result);
	}
}
