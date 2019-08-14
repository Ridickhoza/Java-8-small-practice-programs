package Streams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class PracticeStreams {

	public static void main(String[] args) {
		
		ArrayList<Integer>marks = new ArrayList<Integer>();
		
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);

		System.out.println(marks);
		//counts failed students in a collection
		System.out.println("counts failed students in a collection");
		long noOfFailedStudents=marks.stream().filter(i->i<50).count();
		System.out.println(noOfFailedStudents);
		System.out.println("");
		System.out.println("sorts numbers in acsending order");
		//sorts numbers in acsending order
		List<Integer> sortedList = marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println("");
		
		System.out.println("sorting values in descending order");
		//sorting values in descending order
		List<Integer> descSortedList = marks.stream().sorted((i1,i2)->(i1<i2)?+1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(descSortedList);
		System.out.println("");
		
		System.out.println("Default sorting values in ascending by using comparable interface with compareto method");
		//Default sorting values in ascending by using comparable interface with compareto method
		List<Integer> compareToAscSortedList = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(compareToAscSortedList);
		System.out.println("");

		System.out.println("Default sorting values in descending by using comparable interface with compareto method");
		//Default sorting values in descending by using comparable interface with compareto method
		List<Integer> compareToDescSortedList = marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(compareToDescSortedList);
		
		
		//Strings
		
		ArrayList<String>l = new ArrayList<String>();
		l.add("Sunny khoza");
		l.add("Kajalkjk");
		l.add("Prabhas");
		l.add("Anushka");
		l.add("Mallikas");
		
		
		System.out.println(l);
		List<String>sortedString = l.stream().sorted((i1,i2)->i1.compareToIgnoreCase(i2)).collect(Collectors.toList());
		System.out.println(sortedString);
		
		
		//comparator object
		
		Comparator<String>c=(i1,i2)->{
			int l1=i1.length();
			int l2=i2.length();
			
			if(l1<l2)return -1;
			else if(l2>l1)return 1;
			else return i1.compareTo(i2);
		};
		

		List<String>sortedStringC = l.stream().sorted(c).collect(Collectors.toList());
		System.out.println(sortedStringC);
         
	}

}
