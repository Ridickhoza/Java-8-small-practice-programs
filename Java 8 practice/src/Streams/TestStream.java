package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class TestStream {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(15);
		list.add(25);
		
		System.out.println(list);
		
		//without streams
		/*ArrayList<Integer>l1=new ArrayList<Integer>();
		
		for(Integer I1 : list) {
			if(I1 %2==0){
				
				l1.add(I1);
			}
			
		}
		
		System.out.println(l1);*/
		
		//With streams concepts
		
		List<Integer>l1=list.stream().filter(I1->I1%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer>l3=list.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(l3);
		

	}

}
