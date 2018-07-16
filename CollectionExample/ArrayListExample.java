package CollectionExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		b.add(30);
		b.add(40);
		a.add(10);
		a.add(20);
		a.addAll(b);
		a.add(50);
		a.add(2,25);
		a.remove(4);
		System.out.println(a.indexOf(25));
		System.out.println(a.get(2));
		//b.clear();
		a.addAll(b);
	    System.out.println(a.lastIndexOf(15));
	    Iterator itr=a.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		System.out.println(a);
		Object[] c=	a.toArray();
		for(Object i:c)
			System.out.println(i);
	
	}

}
