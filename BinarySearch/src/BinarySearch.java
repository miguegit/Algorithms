
public class BinarySearch {

	
//	In computer science, a binary search or half-interval search algorithm finds the position of a specified input value (the search "key") within an array sorted by key value
//	Worst case performance		O(log n)
//	Best case performance		O(1)
//	Average case performance	O(log n)
//	Worst case space complexity O(1)
	
	
	public static void main(String[] args) {
		
	int[] l = {1,2,3,11,15,39,45,63,67,89,91,95};	

	System.out.println(binarySearch(l, 89, 0, l.length-1));
	
	}

	private static int binarySearch(int[] elements, int objetive, int minimum_index, int maximum_index){
		if(maximum_index<minimum_index){
			return -1;	//The indexes are not correct
		}else{
			int mid_index = (minimum_index+maximum_index)/2;
			if(elements[mid_index] == objetive){
				return mid_index;
			}else if(objetive>elements[mid_index]){
				return binarySearch(elements, objetive, mid_index+1, maximum_index);
			}else{
				return binarySearch(elements, objetive, minimum_index, mid_index-1);
			}
		}
		
	}
		
		
		
	

}
