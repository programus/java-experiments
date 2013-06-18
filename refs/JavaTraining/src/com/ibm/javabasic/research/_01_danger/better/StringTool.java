package com.ibm.javabasic.research._01_danger.better;

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
		int l = 0; 
		if(string != null){ 
			try {
				l = string.getBytes().length; 
			}
			catch (RuntimeException e) {
				l = -1; 
			}
		}
		else {
			l = -1; 
		}
		return l; 
	}
	
	/**
	 * Trim all whitespace characters. 
	 * @param string original String
	 * @return String after trim. 
	 */
	public static String unicodeTrim(String string) {
        if (string != null) {
            return string.replaceAll("^[\\s\u3000]+|[\\s\u3000]+$", ""); 
        } else {
            return null; 
        }
	}
}
