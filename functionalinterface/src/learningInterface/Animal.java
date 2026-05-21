package learningInterface;


interface Animals {
	void sound();

}
class Dog implements Animals{

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Dog barks");
	}
	
}




public class Animal {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog d = new Dog();
        d.sound();
    }
	
}


