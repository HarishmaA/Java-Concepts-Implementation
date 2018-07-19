import java.util.Queue;
import java.util.LinkedList;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < 5; i++)
			queue.add(i);
		int removedElement = queue.remove();
		System.out.println(removedElement);
		int head = queue.peek();
		System.out.println(head);
		System.out.println(queue.size());
		System.out.println(queue);

	}

}
