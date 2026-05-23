package suplierFunctionalInterface;


import java.util.function.Supplier;


//Random OTP Generator

public class SuplierDemo {
public static void main(String[] args) {
	Supplier<String> supplier = () ->{
		String otp = "";
		for (int i = 1; i<=5 ; i++) {
		otp+= (int) (Math.random() * 10);		
		}
		return otp;	
	};
	System.out.println(supplier.get());
	
}
}
