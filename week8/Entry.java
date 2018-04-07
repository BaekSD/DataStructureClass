package dataStructure.chapter8.pq;

public class Entry {
	private int key;
	private Object obj;
	
	public Entry(int key, Object obj) {
		this.key = key;
		this.obj = obj;
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getObj() {
		return obj;
	}
	
	public String toString() {
		return "{"+key+", "+obj.toString()+"}";
	}
	
	public void printDataAndKey() {
		System.out.println(toString());
	}
}
