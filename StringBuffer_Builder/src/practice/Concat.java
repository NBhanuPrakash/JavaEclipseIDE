package practice;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concat st = new Concat();
		st.countermethod();
		twonames();
		examples();

	}
	
	
	public static void twonames() {
		String name = "Bhanu";
		String name2 = "Prakash";
		name="Sai";
		System.out.println("COncatination Name is..."+name.concat(name2));
		System.out.println("---------------------------------------------------------");
	}
	
	String countermethod() {
		String name = "Bhanu";
		System.out.println("Name Place Will See..."+name.indexOf('h'));
		System.out.println("Let see About Fourth Postion..."+name.charAt(4));
		System.out.println("---------------------------------------------------------");
		return name;
		
	}
	
	static String examples() {
		String s1 = "Bhanu Prakash";
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 4));
		System.out.println(s1.subSequence(1, 4));
		System.out.println(s1.replace('B', 'S'));
		System.out.println(s1.replace("Bhanu", "Sai"));
		System.out.println(s1.split(""));
		System.out.println("---------------------------------------------------------");

		return s1;
	}

}
