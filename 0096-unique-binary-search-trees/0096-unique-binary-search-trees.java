class Solution {
    Map<Integer, Integer> m = new HashMap<>();
    public int numTrees(int n) {
        return numTreesUtil(n);
    }
    int numTreesUtil(int n){
        if(n <= 1){
            return 1;
        }

        if(m.containsKey(n)){
            return m.get(n);
        }

        int res = 0;
        for(int i=0; i<n; i++){
            int l = numTreesUtil(i);
            int r = numTreesUtil(n-i-1);
            res += l * r;
        }

        m.put(n, res);

        return res;
    }
}