package problem2;

import java.util.Arrays;

public class MyTable {

	Entry[] entries = new Entry[26];
	
	public void add(char c, String s) 
	{
		
		int index=c-'a';
		if(index>=0 && index<26)
		{
			entries[index]=new Entry(c,s);
		}
	}
	String get(char ch)
	{
		String name="";
		int indexg=ch-'a';
		int count1=0;
		if(indexg>0 && indexg<26)
		{	
			for(Entry e:entries)
			{
				if(e.getC()==ch)
				{
					name=e.toString();
					break;
				}
			}
	  }
		return name;
	}
	
	@Override
	public String toString() {
	//	return Arrays.toString(entries);
		StringBuilder st=new StringBuilder();
		char ch;
		int index=97;
		for(Entry e:entries)
		{	
			ch=(char)index;
			if(e==null)
			{
				e=new Entry(ch," ");
			}
				st.append(e.getC() + "->" + e.getS() + "\n");
				index++;
		}
		return st.toString();
		
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
			return this.c + "->" + this.s + "\n";
			
		}
	}

	
 
}
