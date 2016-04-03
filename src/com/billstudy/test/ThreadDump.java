package com.billstudy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 测试证明，可以将堆中数据解读出来。危险！
 */
public class ThreadDump {
	String password = "123456";
	char[] password_char = new char[]{'1','2','3'};
	List<String> names = new ArrayList<String>();

	{
		for (int i = 0; i < 10; i++) {
			names.add("bill-" + i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadDump threadDump = new ThreadDump();

		TimeUnit.SECONDS.sleep(1000); 
	}
}
