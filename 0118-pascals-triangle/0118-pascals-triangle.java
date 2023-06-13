class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int row=1; row<=n; row++){
            List<Integer> tempList = new ArrayList<>();
            for(int col=1; col<=row; col++){
                tempList.add(nCr(row-1, col-1));
            }
            ans.add(tempList);
        }
        return ans;
    }

    public static int nCr(int row, int col){
        long res = 1;
        for(int i=0; i<col; i++){
            res = res*(row-i);
            res = res/(i+1);
        }
        return (int) res;
    }
}