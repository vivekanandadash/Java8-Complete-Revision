package methodRefference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StrngtoInt {
public static void main(String[] args) {
//	Convert string to Integer
	
	Function<String, Integer>fn = (x) -> Integer.parseInt(x);
	Function<String, Integer>fn1 = Integer::parseInt;
    
//	Convert lambda to method reference:
	
	Integer apply = fn.apply("25");
	System.out.println("This is from lamda function");
	System.out.println(apply+" " + apply.getClass());
	System.out.println("==================================");
	
	System.out.println("This is from method refference");
	Integer apply2 = fn1.apply("42");
	System.out.println(apply2+" " + apply.getClass());
	
	
	System.out.println("=====================================");
	
//	Use method reference for: x -> Math.abs(x)
	
	Function<Integer,Integer> con  = (x) -> Math.abs(x);
	Function<Integer,Integer> con1 = Math::abs;
	Integer apply3 = con.apply(-45);
	Integer apply4 = con1.apply(-54);
	System.out.println(apply3);
	System.out.println(apply4);
	

	
	
	
}

}
