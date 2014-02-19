import java.util.Arrays;


public class QuickSort {

	public static void main(String[] args) {
		
		int[] elements = {2,19,1,6,56,12,89,3,67,23};
		quickSort(elements, 0, elements.length-1);
		System.out.println(Arrays.toString(elements));	

	}

	public static void quickSort(int[] elements, int leftIndex, int rightIndex){
		int pivot = elements[leftIndex];
		int i = leftIndex;
		int j = rightIndex;
		while(i<j){
			while(elements[i] <= pivot && i<j) i++;
			while(elements[j] > pivot) j--;
			if(i<j){
				int aux = elements[i];
				elements[i] = elements[j];
				elements[j] = aux;
			}
		}
		elements[leftIndex] = elements[j];
		elements[j] = pivot;
		if(leftIndex < j-1){
			quickSort(elements,leftIndex,j-1);
		}
		if(j+1 < rightIndex){
			quickSort(elements, j+1, rightIndex);
		}
	}
	
	
}
