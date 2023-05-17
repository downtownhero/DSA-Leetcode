class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nge = new int[n];
        st.push(0);
        for (int i = 1; i < 2*n; i++) {
            while (st.size() > 0 && arr[i%n] > arr[st.peek()]){
                nge[st.peek()] = arr[i%n];
                st.pop();
            }
            if(i<n){
                st.push(i%n);
            }
        }
        while (!st.empty()){
            nge[st.peek()] = -1;
            st.pop();
        }


        // for(int i = 2 * n - 1; i >= 0; i--){
        //     while (st.isEmpty() == false && st.peek() <= arr[i%n]){
        //         st.pop();
        //     }
        //     if(i<n){
        //         if(st.isEmpty() == false) nge[i] = st.peek();
        //         else nge[i] = -1;
        //     }
        //     st.push(arr[i%n]);
        // }
        return nge;

    }
}