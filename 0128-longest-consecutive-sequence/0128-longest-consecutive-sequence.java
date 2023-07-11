class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int lastS = Integer.MIN_VALUE;
        int longest = 0;
        int count = 0;

        for(int i=0; i<n; i++){
            if(nums[i] - 1 == lastS){
                count++;
                lastS = nums[i];
            } else if (nums[i] != lastS){
                count = 1;
                lastS = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}



// Brute-Force
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         int n = nums.length;
//         int len = 0;
//         for(int i=0; i<n; i++){
//             int count=0;
//             int x = nums[i];
//             while(ls(nums, x) == true){
//                 x++;
//                 count++;
//             }
//             len = Math.max(count, len);
//         }
//         return len;
//     }

//     public static boolean ls(int[] arr, int x){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == x){
//                 return true;
//             }
//         }
//         return false;
//     }
// }