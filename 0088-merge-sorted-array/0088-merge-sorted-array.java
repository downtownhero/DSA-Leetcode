class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int[] arr = new int[n+m];
        int idx = 0;
        int left = 0;
        int right = 0;

        while(left < m && right < n){
            if(arr1[left] <= arr2[right]){
                arr[idx] = arr1[left];
                idx++;
                left++;
            } else {
                arr[idx] = arr2[right];
                idx++;
                right++;
            }
        }

        while(left < m){
            arr[idx++] = arr1[left++]; 
        }

        while (right < n){
            arr[idx++] = arr2[right++];
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n+m; i++){
            arr1[i] = arr[i];
        }
    }
}