package OOPoldC2019;

public class TestEncapsulation {

	public static void main(String[] args) {
		// Encapsulation we can use private variable by use setter and getter
		
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setID(100);
		System.out.println(encapsulation.getID());
		
		encapsulation.setName("Apu");
		System.out.println(encapsulation.getName());
	}

}
