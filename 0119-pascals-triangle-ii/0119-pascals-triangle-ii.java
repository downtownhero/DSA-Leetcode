class Solution {
    public List<Integer> getRow(int n) {
        long res = 1;
        List<Integer> ans = new ArrayList<>();
        ans.add((int) res);
        for(int i=0; i<n; i++){
            res = res*(n-i);
            res =  res/(i+1);
            ans.add((int) res);
        }

        return ans;
    }
}