// Question link :- https://leetcode.com/problems/same-tree/?envType=problem-list-v2&envId=tree

public class TreeNode 
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) 
    {
        this.val = val;
    }
}

class Solution 
{
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
    
        if (p == null && q == null) 
        {
            return true;
        }

        if (p == null || q == null) 
        {
            return false;
        }
        
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
