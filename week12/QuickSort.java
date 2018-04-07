public class QuickSort {
	public static void main(String[] args) {
		int array[] = new int[30];

		System.out.println("Before Quick Sort");
		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random() * 1000);
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		quickSort(array);
		
		System.out.println("After Quick Sort");
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}
	
	public static void quickSort(int[] array) {
		int[] small = new int[array.length];
		int[] big = new int[array.length];
		int[] tmp;
		int scnt=0, bcnt=0;
		int i;
		
		int randIndex = (int)(Math.random()*array.length);
		int randNum = array[randIndex];
		
		for(i=0; i<array.length; i++) {
			if(i == randIndex)
				continue;
			if(array[i] <= array[randIndex]) {
				small[scnt] = array[i];
				scnt++;
			} else {
				big[bcnt] = array[i];
				bcnt++;
			}
		}
		
		if(scnt > 0) {
			tmp = new int[scnt];
			for(i=0; i<scnt; i++)
				tmp[i] = small[i];
			small = tmp;
			quickSort(small);
		}
		if(bcnt > 0) {
			tmp = new int[bcnt];
			for(i=0; i<bcnt; i++)
				tmp[i] = big[i];
			big = tmp;
			quickSort(big);
		}
		
		for(i=0; i<scnt; i++)
			array[i] = small[i];
		array[scnt] = randNum;
		for(i=scnt+1; i<array.length; i++)
			array[i] = big[i-scnt-1];
	}
}
