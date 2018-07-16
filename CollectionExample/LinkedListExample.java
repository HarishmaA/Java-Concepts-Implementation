package CollectionExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
	LinkedList<Integer> a = new LinkedList<>();
	LinkedList<Integer> b=new LinkedList<>();
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
	 System.out.println(a.lastIndexOf(10));
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

