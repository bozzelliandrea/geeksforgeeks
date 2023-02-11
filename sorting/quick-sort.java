


class Solution {
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high) {
            
            int pivot = arr[high];
            int left = low;
            
            for(int right=left; right < high; right++) {
                if(arr[right] < pivot) {
                    // swap
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                } 
            }
            
            arr[high] = arr[left];
            arr[left] = pivot;
            
            
            quickSort(arr, low, left - 1);
            quickSort(arr, left + 1, high);
        }
        
    }
}
