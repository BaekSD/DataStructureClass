package dataStructure;
public class ArrayList {
	
	private int[] arr = new int[128];
	private int arrayIndex = 0;
	
	public ArrayList() {
		for(int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
		System.out.println("Array is initialized.");
	}
	
	public boolean add(int index, int num) {
		if(isFull()) {
			System.out.println("Error : Array is full");
			return false;
		} else {
			if(index > arrayIndex || index < 0) {
				System.out.println("Error : Invalid index");
				return false;
			} else {
				for(int i=arrayIndex; i>=index; i--) {
					arr[i+1] = arr[i];
				}
				arr[index] = num;
				arrayIndex++;
				return true;
			}
		}
	}
	
	public int remove(int index) {
		int res = arr[index];
		if(index >= arrayIndex || index < 0) {
			System.out.println("Error : Invalid index");
			return -1;
		}
		for(int i=index; i<arrayIndex; i++) {
			arr[i] = arr[i+1];
		}
		arrayIndex--;
		return res;
	}
	
	public int get(int index) {
		if(index >= arrayIndex || index < 0) {
			System.out.println("Error : Invalid index");
			return -1;
		}
		return arr[index];
	}
	
	public boolean set(int index, int num) {
		if(index+1 >= arrayIndex || index < 0) {
			System.out.println("Error : Invalid index");
			return false;
		}
		arr[index] = num;
		return true;
	}
	
	public boolean isEmpty() {
		if(arrayIndex == 0)
			return true;
		return false;
	}
	
	public boolean isFull() {
		if(arrayIndex+1 >= arr.length)
			return true;
		return false;
	}
	
	public void printAll() {
		System.out.print("{");
		for(int i=0; i<arrayIndex; i++) {
			System.out.print(arr[i]);
			if(i < arrayIndex-1)
				System.out.print(", ");
		}
		System.out.println("}");
	}
}
