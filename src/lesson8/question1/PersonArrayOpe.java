package lesson8.question1;

public class PersonArrayOpe {
	private Person[] a;
	private int nElems;
	private int size;
	
	public PersonArrayOpe(int max)
	{
		nElems = max;
		a = new Person[nElems];
		size = 0;
	}
	
	public Person find(String searchName) // Pass Lastname as an argument
	{ 
		for(Person test : a){
			if(test.getLastName().equalsIgnoreCase(searchName)) return test;
		}
		return null;
	} 
	public void insert(String last, String first, int age)// Insert at last
	{
		Person p = new Person(last, first, age);

		if(size() == nElems) {
			resize();
		}

		a[size()] = p;
		++size;
		
	}
	public boolean delete(String searchName) // Shift down the elements. Argument should be lastname
	{ 
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(a[i].getLastName().equalsIgnoreCase(searchName)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		
		Person[] temp = new Person[a.length];
		System.arraycopy(a,0,temp,0,index);
		System.arraycopy(a,index+1,temp,index,a.length-(index+1));
		a = temp;
		--size;
		return true;
	}
	public void displayAll() // displays array contents
	{
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(a[i].toString()+", \n");
		}
		sb.append(a[size-1]+"]");
		System.out.println(sb.toString());
	}
	public int size() // Return the number of persons stored in the array
	{
		return size;
	}

	private void resize(){
		System.out.println("resizing");
		int len = a.length;
		int newlen = 2*len;
		Person[] temp = new Person[newlen];
		System.arraycopy(a,0,temp,0,len);
		a = temp;
	} 


}
