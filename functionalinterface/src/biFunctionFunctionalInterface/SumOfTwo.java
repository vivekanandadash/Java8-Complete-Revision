package biFunctionFunctionalInterface;

import java.util.function.BiFunction;

public class SumOfTwo {
public static void main(String[] args) {
	   
	 BiFunction<Integer,Integer,Integer>  sum = (a,b)->{
			return a+b;
		};
		
System.out.println(sum.apply(25, 47));
}
}
