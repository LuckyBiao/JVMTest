package com.billstudy.test;

import java.lang.reflect.Method;

public class TT {
	public static void main(String[] args) throws Exception {
		
//		TT tt = new TT();
		Method sayHi = TT.class.getDeclaredMethod("sayHi", Object.class,int.class,int.class);
		Object result = sayHi.invoke(TT.class.newInstance(), "Bill",3,4);
		System.out.println(result);
		
		/*Method[] declaredMethods = TT.class.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method);
		}*/
		
	}
	
	public static <T> /*String*/ void sayHi(T name,int i,int j){
		System.out.println( "hi," + name + "i:" + i +"j:" + j);
	}
}
