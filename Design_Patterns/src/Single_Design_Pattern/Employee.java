package Single_Design_Pattern;

public class Employee {
	
	private static Employee abjEmployee = null;
	
	private Employee() {
		
	}
	
	public static Employee getboj() {
		if (abjEmployee == null) {
			abjEmployee= new Employee();
			
		}
		return abjEmployee;
		
	}

}
