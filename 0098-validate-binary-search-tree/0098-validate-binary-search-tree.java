/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> check = new ArrayList<>();
        inorderr(check, root);
        for(int i=1; i<check.size(); i++){
            if(check.get(i-1) >= check.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void inorderr(ArrayList<Integer> check, TreeNode root){
        if(root == null){
            return;
        }
        inorderr(check, root.left);
        check.add(root.val);
        inorderr(check, root.right);
    }
}