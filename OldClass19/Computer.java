package OldClass19;

public class Computer {

	int year;
	String model;
	String display = "15 inch";
	static String keys = "36 keys";
	
	//Constructor
	// Constructor name must be same as class name
	public Computer() {
		
	}
	//2nd Constructor
	public Computer(int year) {
		this.year = year;
		System.out.println(year);
	}
	
	//3rd Constructor
	public Computer(String model) {
		this.model = model;
		System.out.println(model);
	}
}
