package com.billstudy.jvm.string;
public class StringTest {
	public static void main(String[] args) {
		String str1 = new StringBuilder("���").append("���").toString();
		System.out.println(str1.intern() == str1);
		
		// �˴������ж��ǳ��������Ѿ�����java
		String str2 = new StringBuilder("ja").append("va").toString();	
		System.out.println(str2.intern() == str2);
	}
}
