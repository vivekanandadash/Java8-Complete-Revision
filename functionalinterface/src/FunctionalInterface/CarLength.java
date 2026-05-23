package functionalInterface;

interface Length{
	void car(String car);
}
public class CarLength {
public static void main(String[] args) {
	
  Length l = ( name)->{
		System.out.println(name.length());
	};
	
	//we can also write like this 
//	Length l = name->	System.out.println(name.length());
	
	l.car("Volkswagen");
}
}
