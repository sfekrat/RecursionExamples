public class QuickSort {
	public static void quickSort(int[] data,int low, int high) {
		if(low < high) {
			int j = partition(data,low, high);
			quickSort(data, low, j);
			quickSort(data, j+1, high);
		}
	}
	private static int partition(int[] data,int low, int high) {
		// Quick Note: In order to make this algorithm run in O(nlogn):
		// You have two options:
		// 1. Choose the pivot element to be the middle element.
		// 2. Choose pivot to be a random element in the list.
		int pivot = data[low];
		int i = low;
		int j = high;
		while(i < j) {
			do {
				i++;
			}while(data[i] <= pivot);
			do {
				j--;
			} while(data[j] > pivot);
			if( i < j) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		int temp = data[low];
		data[low] = data[j];
		data[j] = temp;
		return j;
	}
	public static void main(String[] args) {
		int[] data = new int[] {10,16,8,12,15,6,3,9,5, Integer.MAX_VALUE};
		quickSort(data,0, data.length-1);
		for(int i = 0; i < data.length - 1; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
