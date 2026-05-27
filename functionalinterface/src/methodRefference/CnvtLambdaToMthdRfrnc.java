package methodRefference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Q1)Convert the following lambda into a method reference:
//list.forEach(x -> System.out.println(x));


public class CnvtLambdaToMthdRfrnc {
	public static void main(String[] args) {
		List<String> list  = Arrays.asList("A","B","C");
		list.forEach(System.out::println);
		list.forEach(x -> System.out.println(x));
		
//Q2)		Convert this lambda into method reference: give me full code
		
//		Lambda expression
		
		 Function<String,String> lam =  s -> s.toUpperCase();
	      System.out.println(lam.apply("vivekananda Dash"));
	      
//	      Method Reference
	      
	      Function<String, String> methodReference = String::toUpperCase;
	      System.out.println(methodReference.apply("Vivek"));
	      
//	      Convert this lambda into method reference:
	      
	      BiFunction<String,String,Integer> compare = (a, b) -> a.compareTo(b);
	      System.out.println(compare.apply("banana", "Banana"));
	      
	      
	      BiFunction<String, String, Integer> methodRef = String::compareTo;
	      System.out.println(methodRef.apply("Banana", "Banana"));
	   
	      
	      
	      
		
	}

}
