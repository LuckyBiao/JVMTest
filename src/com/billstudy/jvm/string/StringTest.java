package com.billstudy.jvm.string;
public class StringTest {
	public static void main(String[] args) {
		String str1 = new StringBuilder("大彪").append("你好").toString();
		System.out.println(str1.intern() == str1);
		
		// 此处初步判断是常量池中已经有了java
		String str2 = new StringBuilder("ja").append("va").toString();	
		System.out.println(str2.intern() == str2);
	}
}
