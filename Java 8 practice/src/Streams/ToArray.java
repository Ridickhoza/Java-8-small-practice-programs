package Streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ToArray {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		Integer i[] = l.stream().toArray(Integer[]::new);
		Stream.of(i).forEach(System.out::println);
		
		Stream<Integer> s = Stream.of(9,99,999,9999,9999);
		
		s.forEach(System.out::println);
		
		for(Integer i1:i) {
			
			System.out.println(i1);
			
		}

	}

}
