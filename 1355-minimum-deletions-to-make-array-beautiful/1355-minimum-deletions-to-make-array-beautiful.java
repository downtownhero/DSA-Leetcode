class Solution {
    public int minDeletion(int[] nums) {
        int ans=0;
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i += 2) { 
            if (nums[i] == nums[i + 1]) {
                counter++;
                i--;
            }
        }
        return (nums.length - counter) % 2 == 1?++counter: counter;
    }
}