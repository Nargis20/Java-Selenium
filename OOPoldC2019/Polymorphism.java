package OOPoldC2019;

public class Polymorphism extends ConcreteCar {
	//Method Overloading-- Compile Time or Static Polymorphism
	//same method, different parameters
	
	public void calculator(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void calculator(int a, int b, int d) {
		int c = a+b;
		double g = c/d;
		System.out.println(g);
	}

	//Method Overriding
	@Override
	  public void autoHeadLight() {
		System.out.println("Headlight --- Polymorphism Class");  
	   }
	
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();	
		polymorphism.calculator(4, 99);
		polymorphism.calculator(4, 99, 3);
		polymorphism.autoHeadLight();

	}

}
