package practQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class NumberSorting {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(24);
		arrayList.add(41);
		arrayList.add(247);
		arrayList.add(78);
		arrayList.add(75);
		arrayList.add(89);
		arrayList.add(98);
		System.out.println("Use foreach method  to print the arraylist: ");
		System.out.println("=============================================");

		arrayList.forEach(i -> System.out.println(i));

		Collections.sort(arrayList, Collections.reverseOrder());
		System.out.println("Number using collections reverseorder method "+ arrayList);

		Collections.sort(arrayList, (i, j) -> (i > j) ? -1 : 1);
		System.out.println("sorting using bifunction Functional interface" + arrayList);
		
		
		
//		Print all names using method reference
		List<String> names = Arrays.asList("Ram", "Shyam", "Hari");
		names.forEach(System.out::println);
		names.forEach(n->System.out.println(n));
		
		
//		Convert all strings to uppercase
		
		List<String> names1 = Arrays.asList("java", "spring", "react");
		System.out.println("1");
		
//		using lambda
		Consumer<String> consumer = n->System.out.println(n);
	    names1.forEach(consumer);
		System.out.println("1");

//		consumer.accept("kichi");
		
//		using ArrayList convert to UpperCase
	    List<String> uppercase = new ArrayList<String>();
	    names1.forEach(n->uppercase.add(n.toUpperCase()));
	    System.out.println(uppercase);
	    
//	    Using for each loop
	    for (String string : names1) {
		    System.out.println(string.toUpperCase());
		}
	    
//	    Using for method reference
//	    names1.forEach(String::toUpperCase);   
	}
	

}
