package problem2;

public class Main {

	public static void main(String[] args) {
		
		MyTable t = new MyTable();
		
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		t.add('m',"Mengistu");
		
		System.out.println("\n");
		String s = t.get('b');
		
		System.out.println("Name: " + s);
		
		System.out.println("The output shows empty value for those characters which doesn't have value,\n I did that delevrately so that you can easily see its value");
	
		System.out.println("\n");
		System.out.println(t.toString());
		
	}

}
