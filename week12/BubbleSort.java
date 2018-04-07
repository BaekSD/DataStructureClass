
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {5,1,6,3,2};
		
		System.out.println("Before Bubble Sort");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		bubbleSort(array);
		
		System.out.println("After Bubble Sort");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
	}
	
	public static void bubbleSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1-i; j++) {
				if(array[j] > array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	}
}
