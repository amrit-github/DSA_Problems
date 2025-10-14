package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 100. Same Tree
Solved
Easy
Topics
premium lock icon
Companies
Given the roots of two binary trees p and q, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

 

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true
Example 2:


Input: p = [1,2], q = [1,null,2]
Output: false
Example 3:


Input: p = [1,2,1], q = [1,1,2]
Output: false
 

Constraints:

The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */
public class LC_100 {

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

    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        traversePreOrder(p, l1);
        traversePreOrder(q, l2);
        if(l1.equals(l2)) return true;
        return false;
    }

    public List<Integer> traversePreOrder(TreeNode root, List<Integer> list){
        if(root == null) {
            list.add(null);
            return list;
        }
        list.add(root.val);
        traversePreOrder(root.left, list);
        traversePreOrder(root.right, list);
        return list;
    }
}