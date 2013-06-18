package com.ibm.javabasic.research._05_equals.better;

/**
 *
 * @author  Wang Yuan
 */
public class EqTester {
    
    /** Creates a new instance of EqResearchMain */
    public EqTester() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // We create two instance of the same class with the same initial values. But default equals() function give us wrong result. 
        System.out.println("new sth(1, new int) : " + new Something(1, new Integer(3)).equals(new Something(1, new Integer(3))));
        Integer three = new Integer(3); 
		System.out.println("new sth(1, three) : " + new Something(1, three).equals(new Something(1, three)));
		System.out.println("new sth(1, null) : " + new Something(1, null).equals(new Something(1, null)));
        System.out.println("new StringBuffer : " + new StringBuffer("a").equals(new StringBuffer("a")));
        
        // String implements equals very well. 
        System.out.println("new StringBuffer.toString : " + new StringBuffer("a").toString().equals(new StringBuffer("a").toString()));
        System.out.println("new StringBuffer.toString == : " + (new StringBuffer("a").toString() == new StringBuffer("a").toString()));
        System.out.println("new String : " + new String("a").equals(new String("a"))); 
    }
    
}
