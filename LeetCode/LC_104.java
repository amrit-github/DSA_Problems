/**
* Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
*/
package LeetCode;
public class LC_104 {

    public static void main(String[] args) {
        
    }
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }

    int getMaxDepth(TreeNode root){
        if(root == null) return 0;
        int L = getMaxDepth(root.left);
        int R = getMaxDepth(root.right);
        return Math.max(L, R) + 1; // +1 is done to add the current node, Math.max is done to keep track of deepest node iterated at each level till now
    }
}