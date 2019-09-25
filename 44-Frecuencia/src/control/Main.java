package control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();
		
		array.add("dsf");
		array.add("23");
		array.add("dsfaj");
		array.add("dsf");
		array.add("dsf");
		
		System.out.println(frecuency(array, "dsf"));

	}
	
	public static <E> int frecuency(Collection<E> col, E elem) {
		
		int frecuency = 0;

		Iterator<E> it = col.iterator();
		
		 while (it.hasNext())
			 if(it.next().equals(elem)) frecuency++;
		
			
		
		return frecuency;
	}

}
