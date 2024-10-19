
//Question Link :- https://leetcode.com/problems/binary-tree-inorder-traversal/?envType=problem-list-v2&envId=tree

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    // TreeNode() {}
    TreeNode(int value) 
    {
        this.value = value;
    }
    TreeNode(int value, TreeNode left, TreeNode right) 
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>(); 
        inorder(root , result);
        return result ;
        
    }

    public void inorder(TreeNode root , List<Integer> result)
    {
        if(root != null)
        {
            inorder(root.left , result);
            result.add(root.value);
            inorder(root.right , result);
        }
    }
}