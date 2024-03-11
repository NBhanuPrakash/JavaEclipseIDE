package practice;

public class ReverseName {
	public static void main(String[] args) {
		name();
		simpleName();
		Easy();

	}

	public static void name() {
		String name = "Bhanu Prakash";
		char[] namearray = name.toCharArray();
		int startindex = 0;
		int endindex = namearray.length - 1;
		while (startindex < endindex) {
			char temp = namearray[startindex];
			namearray[startindex] = namearray[endindex];
			namearray[endindex] = temp;
			startindex++;
			endindex--;
		}
		for (char name2 : namearray) {
			System.out.print(name2);

		}
		System.out.println("");
		System.out.println("-----------------------------");

	}

	private static void simpleName() {

		String name = "Bhanu Prakash";
		StringBuilder st = new StringBuilder(name);
		System.out.println(st.reverse());

	}
	private static void Easy() {
		String name = "Bhanu Prakash";
		StringBuffer sv = new StringBuffer(name);
		System.out.println(sv.reverse());
		
		
	}
	protected void finalize() {
		//GarbageCollection.....
		
	}

}
