package com.ibm.javabasic.research._04_inherclassinit;

import javax.swing.JOptionPane;

public class TestHelper {
	/**
	 * A method to print message when assign a int by this method. 
	 * @param mesg the message to output
	 * @return the int value to assign
	 */
	public static int getInt(String mesg) {
		System.out.println(mesg); 
		return mesg.length(); 
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// modify the debugNo to select what you want to test. 
		int debugNo = TestHelper.selectDebugNo(); 
		
		if (debugNo == 0) {
			// Test the init order just when one class is loaded 
			// and then create an instance. 
			SuperClass superClass; 
			printSep();
			Class.forName(SuperClass.class.getName());  
			//SuperClass.staticMethod(); // <- when you call any static method, the class will be load. 
			for (int i = 0; i < 3; i++) { 
				printSep(); 
				superClass = new SuperClass(); 
			}
		}
		else if (debugNo == 1) {
			// Test the init order just when an instance of sub class. 
			SubClass subClass; 
			subClass = new SubClass(); 
		}
		else if (debugNo == 2) {
			// Test the init order when a sub class is loaded 
			// and then create an instance of sub class. 
			SubClass subClass; 
			printSep(); 
			Class.forName(SubClass.class.getName()); 
			printSep();  
			subClass = new SubClass(); 
		}
		else if (debugNo == 3) {
			// Almost the same as debugNo == 0
			// but move initializer blocks top. 
			SuperClassCopy superClass; 
			printSep();
			Class.forName(SuperClassCopy.class.getName());  
			//SuperClass.staticMethod();
			for (int i = 0; i < 3; i++) { 
				printSep(); 
				superClass = new SuperClassCopy(); 
			}
		}
		else if (debugNo == 4) {
			// 1st, load super class. 
			// 2nd, create an instance of sub class. 
			// What will happen? 
			Class.forName(SuperClass.class.getName()); 
			printSep(); 
			new SubClass(); 
		}
		
		System.exit(0); 
	}
	
	public static int selectDebugNo() {
		String[] selections = {
			"1. Load a class then create instance", 
			"2. Create a subclass instance", 
			"3. Load a subclass then create instance", 
			"4. Just initialize code order is different from No. 1.", 
			"5. Load a superclass then create subclass instance",
		}; 
		Object selection = JOptionPane.showInputDialog(null, "Please select a test:", "input", JOptionPane.QUESTION_MESSAGE, null, selections, selections[0]); 
		for (int i = 0; i < selections.length; i++) {
			if (selections[i].equals(selection)) {
				return i; 
			}
		}
		return -1; 
	}
	
	public static void printSep() {
		System.out.println("==============="); 		
	}
}
