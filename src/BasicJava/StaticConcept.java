package BasicJava;

public class StaticConcept {
	
	// class variable
			String name;
			static int age;
			public void getName() {
				System.out.println("get Name");
			}
			
		public static void getValue() {
			System.out.println("get Value");
		}

	public static void main(String[] args) {
		
		StaticConcept obj = new StaticConcept();
		
		obj.name = "TOM";
		age=25;
		obj.getName();
		 //static way
		System.out.println(age);
		getValue();
		System.out.println(StaticConcept.age);
		StaticConcept.getValue();
	}

}
