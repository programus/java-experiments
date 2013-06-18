package com.ibm.javabasic.research._01_danger;

/**
 * String Tool.
 * 
 * @author Wang_Yuan
 *
 */
public class StringTool {
	
	/**
	 * Return the bytes length of specified String
	 * @param string A string
	 * @return the bytes length. 
	 */
	public static int getTrueLength(String string) {
		return string.getBytes().length; 
	}
	
	/**
	 * Trim all whitespace characters. 
	 * @param string original String
	 * @return String after trim. 
	 */
	public static String unicodeTrim(String string) {
        return string.replaceAll("^[\\s\u3000]+|[\\s\u3000]+$", ""); 
	}
}
