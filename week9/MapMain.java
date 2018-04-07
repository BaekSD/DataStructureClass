
public class MapMain {
	public static void main(String[] args) {
		Map map = new Map();
		
		System.out.println("isEmpty() : " + map.isEmpty());
		System.out.println("put(5,\"A\") : " + map.put(5, "A"));
		System.out.println("put(7,\"B\") : " + map.put(7, "B"));
		System.out.println("put(2,\"C\") : " + map.put(2, "C"));
		System.out.println("put(8,\"D\") : " + map.put(8, "D"));
		System.out.println("put(2,\"E\") : " + map.put(2, "E"));
		System.out.println("get(7) : " + map.get(7));
		System.out.println("get(4) : " + map.get(4));
		System.out.println("get(2) : " + map.get(2));
		System.out.println("size() : " + map.size());
		System.out.println("remove(5) : " + map.remove(5));
		System.out.println("remove(2) : " + map.remove(2));
		System.out.println("get(2) : " + map.get(2));
		System.out.println("isEmpty() : " + map.isEmpty());
	}
}
