public class BinarySearch {
	// Binary Search Iteratively
    public static int binarySearchIter(int start, int end, int key, int...data) {
    	while(start <= end) {
    		int mid = (int)Math.floor((start + end)/2);
    		if(data[mid] == key) return mid;
    		else if(data[mid] < key) {
    			start = mid + 1;
    		} else {
    			end = mid -1;
    		}
    	}
    	return -1;
    }
    // Binary Search Recursively
    public static int binarySearchRec(int start, int end, int key, int...data) {
    	if(start == end) {
    		if(data[start] == key) return start;
    		else 
    			return -1;
    	} else {
    		int mid = (int) Math.floor((start+end)/2);
    		if(data[mid] == key) return mid;
    		if(data[mid] < key) {
    			return binarySearchRec(mid + 1, end, key, data);
    		} else {
    			return binarySearchRec(start, mid -1, key, data);
    		}
    	}
    }
}
