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

 // Question Link :- https://leetcode.com/problems/validate-binary-search-tree/?envType=problem-list-v2&envId=binary-tree
 class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        inOrderTraversal(root, values);

        for (int i = 1; i < values.size(); i++) 
        {
            if (values.get(i) <= values.get(i - 1)) 
            {
                return false;
            }
        }
        return true;
    }

    private void inOrderTraversal(TreeNode node, List<Integer> values) {
        if (node == null) 
        {
            return;
        }

        inOrderTraversal(node.left, values);
        values.add(node.val);
        inOrderTraversal(node.right, values);
    }
}