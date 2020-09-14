package OldClass19;

public class Execution {
    public static void main (String [] args) {
    	//Computer Class
    	//Object Creation of a Class
    	Computer refVar1 = new Computer();
    	//IMPORTANT: Class Name + reference variable = new(Keyword) + Constructor;
    	
    	refVar1.year = 1;
    	refVar1.model = "Asus";
    	System.out.println(refVar1.model);
    	
    	//Object Creation of a Class
    	Computer refVar2 = new Computer(2019);
    	
    	//Allocate Value for 3rd Constructor from Computer class
    	Computer refVar3 = new Computer("Mac");
    	System.out.println("It is one : " + refVar3.model);
    	
    	//non static variable, by call reference variable
    	System.out.println(refVar1.display);
    	
    	//Static variable, we can call directly by class name no need to create object or reference variable
    	System.out.println(Computer.keys);
    	
    	//Method Class
    	// Non Static Method - Void
    	//Reference variable always make same name of class name only use lower case
    	//it is easy to remember Reference variable name
    	Method method = new Method();
    	method.getAddress();
    	
    	// Static Method - Void
    	//for static we can call also by class name, non static variable must call by reference variable.
    	Method.getTime();
    	
    	// Non Static Method - Return Type
    	//Method method = new Method();
    	method.calculator2(7, 8);
    	int newValue = method.calculator1(7, 8);
    	System.out.println("Non Static Method Returning value in a variable: " + newValue);
    
    	// Static Method - Return Type
    	 int newValue2 = Method.calculator3(10, 8);
    	 System.out.println("Static Method Returning value in a variable: " + newValue2);
    }
}
