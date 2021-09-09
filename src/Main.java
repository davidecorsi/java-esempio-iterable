import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		for(int i = 1; i <= 20; i++) {
			integerList.add(i);
		}
		System.out.println("Scorro la lista utilizzando un iteratore");
		Iterator<Integer> iterator = integerList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Scorro la lista utilizzando il for each");
		for(Integer n: integerList) {
			System.out.println(n);
		}
	}
}
