import java.util.ArrayList;
import java.util.Collections;

public class SimpleSort1 {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> listInt = new ArrayList<Integer>();

		listInt.add(2);
		listInt.add(1);
		listInt.add(3);
		listInt.add(5);
		listInt.add(4);
		
		System.out.println("======Before Sorting======");
		for(Integer item:listInt) {
			System.out.println(item);
		}
		
		Collections.sort(listInt);

		System.out.println("======After Sorting======");
		for(Integer item:listInt) {
			System.out.println(item);
		}
	}
}
