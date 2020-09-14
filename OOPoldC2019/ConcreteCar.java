package OOPoldC2019;

public class ConcreteCar extends AbstractCar implements InterfaceCar, InterfaceCar2 {
	//implements -- interface
	//extends -- abstract class
	//extends first, implements second
	//when extends we get everything from that class
	//can implements more than 1 interface but can not extends more than one abstract class
	
	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void move() {
	System.out.println("Moving funtionality -- generating car concrete -- coming from car interface");	
	autoBreak();
	System.out.println(a);
	}

	@Override
	public void light() {
			
	}
	
   public void autoHeadLight() {
	  System.out.println("Headlight ---Concrete Class"); 
   }
}
