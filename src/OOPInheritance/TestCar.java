package OOPInheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		
		System.out.println("---------------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("---UP Casting---");
		
		//Top/up Casting
		Car c1 = new BMW(); // child class object can be referred by parent class ref variable
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehical v1 = new BMW();
		
		// reference type check
		
		//down casting
		
		// BMW b1 = (BMW) new Car();
		
		Car c2 = (Car) new Vehical();
	}

}
