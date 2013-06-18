package org.javaresearch;

public class Tester {
	public static String getIPString(int value)
	{
		int mask = 0xff; 
		StringBuffer ip = new StringBuffer(); 
		for (int i = 0; i < 4; i++)
		{
			ip.insert(0, String.valueOf(value & mask)); 
			value = value >>> 8; 
			if (i < 3) {
				ip.insert(0, "."); 
			}
		}

		return ip.toString(); 
	}

	public static int getIPInt(String ip)
	{
		int value = 0; 
		String[] parts = ip.split("\\."); 
		for (int i = 0; i < parts.length; i++)
		{
			value <<= 8; 
			value += Integer.parseInt(parts[i]); 
		}

		return value; 
	}

	public static void main(String[] args) {
		String ip = "255.255.255.255"; 
		System.out.println(getIPInt(ip)); 
		System.out.println(getIPString(getIPInt(ip))); 
		
		String[] p = "9.34.5.6".split("\\."); 
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]); 
		}
	}
}
