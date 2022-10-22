package com.test;

public class StringMain {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("object language");
		System.out.println("original string: " + s);
		System.out.println("length: " + s.length());
//		for (int i = 0; i < s.length(); i++) {
//			int p = i + 1;
//			System.out.println("charectar at position: " + p + " is: " + s.charAt(i));
//		}
		String str = s.toString();
		int pos = str.indexOf("language");
		System.out.println(pos);
		s.insert(pos, "oriented");
		System.out.println(s);
	}

}
