import java.util.ArrayList;

public class Map {
	
	ArrayList<Entry> list;
	
	public Map() {
		list = new ArrayList<Entry>();
	}
	
	public Object get(int key) {
		for(int i=0; i<size(); i++) {
			if(list.get(i).getKey() == key) {
				return list.get(i).getObj();
			}
		}
		return null;
	}
	
	public Object put(int key, Object obj) {
		for(int i=0; i<size(); i++) {
			if(list.get(i).getKey() == key) {
				Object element = list.get(i).getObj();
				list.set(i, new Entry(key,obj));
				return element;
			}
		}
		list.add(new Entry(key,obj));
		return null;
	}
	
	public Object remove(int key) {
		for(int i=0; i<size(); i++) {
			if(list.get(i).getKey() == key) {
				Object element = list.get(i).getObj();
				list.remove(i);
				return element;
			}
		}
		return null;
	}
	
	public ArrayList<Integer> keys() {
		ArrayList<Integer> keys = new ArrayList<Integer>();
		for(int i=0; i<size(); i++) {
			keys.add(list.get(i).getKey());
		}
		return keys;
	}
	
	public ArrayList<Object> values() {
		ArrayList<Object> values = new ArrayList<Object>();
		for(int i=0; i<size(); i++) {
			values.add(list.get(i).getObj());
		}
		return null;
	}
	
	public ArrayList<Entry> entries() {
		return list;
	}
	
	public int size() {
		return list.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
}
