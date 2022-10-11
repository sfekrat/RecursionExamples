
public class MergeSort {
	
	public static void main(String[] args) {
		int[] data = new int[] {-5,20,10,3,2,0};
		mergeSort(data, 0, data.length-1);
	}
	public static void mergeSort(int[] data, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(data, start, mid);
			mergeSort(data, mid + 1, end);
			merge(data, start, mid, end);
		}
	}
	public static void merge(int[] data, int start, int mid, int end) {
		// build temp array to avoid modifying the original content
		int[] temp = new int[end - start + 1];
		
		int i = start, j= mid + 1, k = 0;	
		// While both sub-array have values, then try and merge them in sorted order
		while( i  <= mid && j <= end) {
			if (data[i] <= data[j]) {
				temp[k++] = data[i++];
			} else {
				temp[k++] = data[j++];
			}
		}
		// add the rest of the values from the left sub-array into the result.
		while (i <= mid) {
			temp[k++] = data[i++];
		}
		// add the rest of the values from the right sub-array into the result.
		while(j <= end) {
			temp[k++] = data[j++];
		}
		// Copy the sorted elements into the original array.
		for (i = start; i <= end; i++) {
			data[i] = temp[i - start];
		}
	}
	// Merge two sorted Linked lists.
	public static void MergedLinkedList(Node A, Node B) {
		if (A == null) return B;
		if (B == null) return A;
		
		if (A.val < B.val) {
			A.next = MergedLinkedList(A.next, B);
			return A;
		} else {
			B.next = MergedLinkedList(A, B.next);
			return B;
		}
	}
}
