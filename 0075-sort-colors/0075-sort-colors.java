class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid] == 0){
                // int temp = arr[mid];
                // arr[mid] = arr[low];
                // arr[low] = temp;
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1){
                mid++;
            } else {
                // int temp = arr[mid];
                // arr[mid] = arr[high];
                // arr[high] = temp;
                swap(arr, mid, high);
                high--;
            }
        }
    }
    public int[] swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;

        return arr;
    }
}