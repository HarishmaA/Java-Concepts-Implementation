package MapExample;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class MultiMap {

	public static void main(String[] args) {
		HashMap<String, ArrayList<Integer>> multiMap = new HashMap<>();
		ArrayList<Integer> phoneNo1 = new ArrayList<>();
		phoneNo1.add(123456789);
		phoneNo1.add(987654321);
		ArrayList<Integer> phoneNo2 = new ArrayList<>();
		phoneNo2.add(123235435);
		phoneNo2.add(925346534);
		multiMap.put("Heera", phoneNo1);
		multiMap.put("Meera", phoneNo2);
		System.out.println(multiMap);
		Iterator<Map.Entry<String,ArrayList<Integer>>> itr=multiMap.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,ArrayList<Integer>> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}
}
