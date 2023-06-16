class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            res = nums[i] ^ nums[i+1];
            if(res == 0){
                return nums[i];
            }
        }
        return -1;
    }
}