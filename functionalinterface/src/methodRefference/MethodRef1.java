package methodRefference;

@FunctionalInterface
interface MyInterFce{
	public void m1();
}

public class MethodRef1 {
	public static void m2() {
		System.out.println("This is method m2()");
	}

	public static void main(String[] args) {
	 MyInterface methodRefference =   MethodRef1::m2;
	 
	 methodRefference.m1();
	}

}
