class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
        int n = nums.length;
        int[] nge = new int[n];
        nge[n-1] = n;

        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(st.size() != 0 && nums[i] > nums[st.peek()]){
                st.pop();
            }

            if(st.isEmpty()){
                nge[i] = n;
            } else {
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int[] ans = new int[n-k+1];
        int j=0;

        for(int i=0; i<=n-k; i++){
            if(j<i){
                j=i;
            }
            while(nge[j] < i+k){
                j = nge[j];
            }
            ans[i] = nums[j];
        }
    return ans;
    }
}