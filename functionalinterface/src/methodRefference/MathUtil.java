package methodRefference;

import java.util.function.Consumer;

public class MathUtil {

	public static void sqare(int x) {
		System.out.println(x*x);
	}

	public static void main(String[] args) {
    Consumer<Integer>consumer =  MathUtil::sqare;
    consumer.accept(4);
		
		
		
	}
}
