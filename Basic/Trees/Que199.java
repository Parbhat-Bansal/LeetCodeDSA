
//Question Link :- https://leetcode.com/problems/binary-tree-right-side-view/?envType=problem-list-v2&envId=breadth-first-search
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;
 public class TreeNode {
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
 };


 

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();

            for(int i = 0 ; i < size ; i++)
            {
                TreeNode curr = q.poll(); 

                if(i == size - 1)
                {
                    result.add(curr.value);

                }
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

        return result;
    }

}