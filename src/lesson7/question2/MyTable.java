package lesson7.question2;

public class MyTable {
	final int BASE_INDEX = (int)'a';
	private Entry[] entries = new Entry[26];
	
	public String get(char c)
	{
		return entries[getIndex(Character.toLowerCase(c))].str;
	}
	
	public void add(char c, String s)
	{
		Entry ent = new Entry (s, Character.toLowerCase(c));
		
		entries[getIndex(Character.toLowerCase(c))] = ent;
	}
	
	private int getIndex(char c)
	{
		return (int)c - BASE_INDEX;
	}
	
	@Override
	public String toString()
	{
		String str = "";
		for(Entry e: entries)
		{
			if(e != null)
				str = str + e.toString() + "\n";
		}
		
		return str;
	}
	
	private class Entry{
		String str;
		char ch;
		
		Entry(String str, char ch)
		{
			this.str = str;
			this.ch = ch;
		}
		
		@Override
		public String toString()
		{
			return String.valueOf(ch) + "->" + str;
		}
	}

}
