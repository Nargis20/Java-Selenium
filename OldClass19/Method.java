package OldClass19;

public class Method {

	// Non Static Method - Void 
	//(Static is a keyword, call that directly no need static variable)
	//Method name should not same as class name
	public void getAddress() {
		System.out.println("My Address id Plygerville, Texas -78660");
	}
	public void calculator2(int a, int b) {
		int total = a + b;
		System.out.println("As void its only value without variable: " + total);
	}
	
	// Static Method - Void
	// 2 method can be same name but parameter should different
	public static void getTime() {
		System.out.println("Current time is .....");
	}
	
	// Non Static Method - Return Type
	public int calculator1(int a, int b) {
		int total = a + b;
		return total;
		}
	
	// Static Method - Return Type
	public static int calculator3(int a, int b) {
	int total = a - b;
	return total;
	}
	
}
