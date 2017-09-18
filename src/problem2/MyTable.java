package problem2;

import java.util.Arrays;

public class MyTable {

	Entry[] entries ={new Entry('a',""),new Entry('b',""),new Entry('c',""),new Entry('d',""),new Entry('e',""),new Entry('f',""),new Entry('g',""),new Entry('h',""),new Entry('i',""),new Entry('j',""),new Entry('k',""),new Entry('l',""),new Entry('m',""),new Entry('n',""),new Entry('o',""),new Entry('p',""),new Entry('q',""),new Entry('r',""),new Entry('s',""),new Entry('t',""),new Entry('u',""),new Entry('v',""),new Entry('w',""),new Entry('x',""),new Entry('y',""),new Entry('z',"")};
	
	public void add(char c, String s) {
		
	int index=c-'a';
	int count=0;
	if(index>0 && index<26)
	{
		for(Entry e:entries)
		{
			if(index==count)
			{
				e.setC(c);
				e.setS(s);
			}

			count++;
			System.out.println(e.toString());
		}
	 }	
	
	}
	String get(char ch)
	{
		String name="";
		int indexg=ch-'a';
		int count=0;
		if(indexg>0 && indexg<26)
		{
	
		for(Entry e:entries)
		{
			if(indexg==count)
			{
				name=e.getS().toString();
			}

			count++;
			System.out.println(e.toString());
		}
	  }
		return name;
	}
	
	class Entry
	{
		private char c;
		private String s;
		Entry(char c, String s)
		{
			this.c=c;
			this.s=s;		
		}

		public void setS(String s) {
			this.s = s;
		}
		public void setC(char c) {
			this.c = c;
		}
		public char getC() {
			return c;
		}
		public String getS() {
			return this.s;
		}
		public String toString()
		{
			return this.c + "->" + this.s;
			
		}
	}

	
 
}
