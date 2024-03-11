package Single_Design_Pattern;

public class singleton {
	public static void main(String[] args) {
		Employee e1 = Employee.getboj();
		
		Employee e2 = Employee.getboj();
		System.out.println(e1); //These the Singleton design pattern
		System.out.println(e2); //These the Singleton design pattern
		
	}

}
