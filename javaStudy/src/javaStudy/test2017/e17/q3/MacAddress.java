package javaStudy.test2017.e17.q3;

import java.util.regex.Pattern;

public class MacAddress {
	public static String validateMacAddress(String inputMac) {
		String result = "";
		if(inputMac.length() == 17) {
			if(checkTypeA(inputMac)) {
				result = convTypeA(inputMac);
			}else {
				result = "null";
			}
		}
		
		return result;
	}
	
	public static boolean checkTypeA(String inputMac) {
		boolean result = false;

		result = Pattern.matches("^[\\-a-fA-F0-9]*$",inputMac);

		return result;
	}
	
//	public static boolean checkTypeA(String inputMac) {
//		boolean result = false;
//		String[] dash = {
//				inputMac.substring(2, 3),
//				inputMac.substring(5, 6),
//				inputMac.substring(8, 9),
//				inputMac.substring(11, 12),
//				inputMac.substring(14, 15)
//				};
//		for(String d : dash) {
//			if("-".equals(d)) {
//				result = true;
//			} else {
//				result = false;
//			}
//		}
//		
//		if(inputMac != null) {
//			result = Pattern.matches(inputMac,"[a-fA-F0-9]");
//		}
//		return result;
//	}
	
	public static String convTypeA(String inputMac) {
		StringBuilder builder = new StringBuilder();
		builder.append(inputMac.substring(0, 2)).append(inputMac.substring(3,5)).append(".");
		builder.append(inputMac.substring(6, 8)).append(inputMac.substring(9,11)).append(".");
		builder.append(inputMac.substring(12, 14)).append(inputMac.substring(15,17));
		
		return builder.toString();
	}
}
