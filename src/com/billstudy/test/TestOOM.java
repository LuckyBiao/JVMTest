package com.billstudy.test;

import java.util.ArrayList;
import java.util.List;

// -Xms10m -Xmx10m -Xmn5m -XX:+HeapDumpOnOutOfMemoryError -verbose:gc -XX:+PrintGCDetails
public class TestOOM {
	
	static class Obj{
		public byte[] bytes = "map(top(heap.objects(\"java.lang.String\", false, 'overallocation(it) > 0'), overallocationdiff), showOAinfo);".getBytes();
	}
	
	public static void main(String[] args) {
		List<Obj> list = new ArrayList<Obj>();
		while(true){
			list.add(new Obj());
		}
	}
}
