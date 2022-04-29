package org.sample;

import java.util.LinkedList;
import java.util.List;

public class Listpra {
	public static void main(String[] args) {
		
		List a = new LinkedList<>();
		
		a.add(10);
		a.add("java");
		a.add('A');
		a.add(8300191276l);
		a.add(37465.87f);
		a.add(true);
		System.out.println(a);
		
		int size = a.size();
		System.out.println(size);
		
		Object object = a.get(3);
		System.out.println(object);
		
		a.remove(4);
		System.out.println(a);
		
		a.add(3, "sujith");
		System.out.println(a);
		
		a.set(3, 8888);
		System.out.println(a);
		
		boolean contains = a.contains(8888);
		System.out.println(contains);
		
		int indexOf = a.indexOf(8888);
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		for (int i = 0; i <a.size(); i++) {
			
			System.out.println(a.get(i));
			
		}
		
		for (Object object2 : a) {
			System.out.println(object2);
			
		}
		
		
		
		
		
		
		
	}

}
