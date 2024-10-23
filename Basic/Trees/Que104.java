
//   Definition for a binary tree node.
// Question Link :- https://leetcode.com/problems/maximum-depth-of-binary-tree/?envType=problem-list-v2&envId=binary-tree
import java.util.ArrayList;
  public class TreeNode 
  {
      int value;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
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
 
class Solution 
{
    public int maxDepth(TreeNode root) 
    {
        if(root == null)
        {
            return 0 ;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int d = 0 ; // d => depth

        while(!q.isEmpty())
        {
            int size = q.size() ;
            d++;

            for(int i = 0 ; i < size ; i++)
            {
                TreeNode curr = q .poll() ;
                if(curr.left != null)
                {
                    q.add(curr.left);
                }

                if(curr.right != null)
                {
                    q.add(curr.right);
                }
            }
        }

        return d;
    }
}