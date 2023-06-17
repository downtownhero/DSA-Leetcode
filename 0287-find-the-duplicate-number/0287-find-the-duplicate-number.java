class Solution {
    public int findDuplicate(int[] nums) {

        for(int i=0; i<nums.length; i++){
            int index = Math.abs(nums[i]);
            if(nums[index] < 0){
                return index;
            }
            nums[index] = - nums[index];
        }
        return -1;

        // int slow = nums[0];
        // int fast = nums[0];
        // do {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // } while (slow != fast);

        // fast = nums[0];
        // while (slow != fast) {
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }
        // return slow;
    }
}