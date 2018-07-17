package CollectionExample;

import java.util.HashSet;
import java.util.ArrayList;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(4);
		arrayList.add(4);
		arrayList.add(5);
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
		hashSet.add(6);
		hashSet.addAll(arrayList);
		System.out.println(hashSet.size());
		System.out.println(hashSet);
		if (hashSet.contains(3))
			hashSet.remove(3);
		System.out.println(hashSet);
		hashSet.clear();
		if(hashSet.isEmpty())
		{
			System.out.println(hashSet.size());
		}

	}

}
