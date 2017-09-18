package problem2;

public class Main {

	public static void main(String[] args) {
		
		MyTable t = new MyTable();
		
		String s = t.get('b');
		System.out.println("Name: " + s);
		
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println("\n");
	
		System.out.println("\n");
		System.out.println(t.toString());
		
	}

}
