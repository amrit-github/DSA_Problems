package LeetCode;

import java.util.ArrayList;
import java.util.List;

/*
 * 144. Binary Tree Preorder Traversal
Solved
Easy
Topics
premium lock icon
Companies
Given the root of a binary tree, return the preorder traversal of its nodes' values.


Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Explanation:
Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [1,2,4,5,6,7,3,8,9]

Explanation:
Example 3:
Input: root = []
Output: []

Example 4:
Input: root = [1]
Output: [1]

 

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 

Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class LC_144 {

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

    public List<Integer> preorderTraversal(TreeNode root) {
        
        if(root == null) return new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        return preOrder(root, list);
    }

    public List<Integer> preOrder(TreeNode root, List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
        return list;
    }
}