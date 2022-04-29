package org.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setpra {
	public static void main(String[] args) {
		Set<Integer> a = new LinkedHashSet<>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(10);
		
		int size = a.size();
		System.out.println(size);
		
		a.remove(30);
		System.out.println(a);
		
		boolean empty = a.isEmpty();
		System.out.println(empty);
		
		boolean contains = a.contains(60);
		System.out.println(contains);
		
		for (Integer x : a) {
			System.out.println(x);
			
		}
	
		
		
	}

}
