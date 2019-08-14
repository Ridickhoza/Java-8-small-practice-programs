package Streams;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		
		for(Integer i : l) System.out.println(i);
		
		System.out.println();
		l.stream().forEach(System.out::println);
		
		
		
		

	}

}
