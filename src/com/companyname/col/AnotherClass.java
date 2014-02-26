package com.companyname.col;

import com.companyname.col.TestClass.InnerClass;

public class AnotherClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestClass.InnerClass innerClass = new TestClass("Hola").new InnerClass();
		System.out.println(innerClass.getNombre());
	}

}
