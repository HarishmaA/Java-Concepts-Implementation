import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Collections.addAll(list, 3, 4);
		Integer[] arr = { 5, 6 };
		Collections.addAll(list, arr);
		list.add(-1);
		list.add(-3);
		System.out.println(list);
		System.out.println(Collections.min(list));
		System.out.println(Collections.max(list));
		Collections.sort(list);
		list.forEach((l) -> System.out.println(l));

	}

}
