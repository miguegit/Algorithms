import java.util.Arrays;

//Worst case performance	 O(n log n)
//Best case performance    O(n log n) typical, O(n) natural variant
//Average case performance O(n log n)

public class MergeSort {

	public static void main(String[] args) {

		int[] elements = {2,19,1,6,56,12,89,3,67,23};
		mergeSort(elements);
		System.out.println(Arrays.toString(elements));		
		
	}
	
	public static void mergeSort(int[] Array_Of_Elements){
		if(Array_Of_Elements.length > 1){
			int mid_element = Array_Of_Elements.length/2;								
			int[] leftArray   = Arrays.copyOfRange(Array_Of_Elements, 0, mid_element);   //Notice that copyOfRange the "to" side is exclusive but the "from" is inclusive
 			int[] rightArray = Arrays.copyOfRange(Array_Of_Elements, mid_element, Array_Of_Elements.length);
 			mergeSort(leftArray);
 			mergeSort(rightArray);
 			
 			merge(Array_Of_Elements,leftArray,rightArray);
 			
		}
	}

	public static void merge(int[] Array_Of_Elements, int[] leftArray, int[] rightArray) {

		int totalElements = leftArray.length + rightArray.length;
		int position, leftindex, rightindex;
		position = leftindex = rightindex = 0;
		
		while(position<totalElements){
			
			if((leftindex<leftArray.length)&&(rightindex<rightArray.length)){
				if(leftArray[leftindex] < rightArray[rightindex]){
					Array_Of_Elements[position] = leftArray[leftindex];
					position++;
					leftindex++;					
				}else{
					Array_Of_Elements[position] = rightArray[rightindex];
					rightindex++;
					position++;
				}
			}else{
				if(leftindex >= leftArray.length){
					while(rightindex<rightArray.length){
						Array_Of_Elements[position] = rightArray[rightindex];
						rightindex++;
						position++;
					}
				}
				if(rightindex >= rightArray.length){
					while(leftindex<leftArray.length){
						Array_Of_Elements[position] = leftArray[leftindex];
						leftindex++;
						position++;
					}
				}
			}
			
		}
	}

}
