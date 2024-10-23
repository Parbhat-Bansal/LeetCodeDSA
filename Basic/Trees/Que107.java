// Question Link :- https://leetcode.com/problems/binary-tree-level-order-traversal-ii/?envType=problem-list-v2&envId=breadth-first-search

import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;



public class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) 
    {
        this.value = value;
    }
}

class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) 
    {
        List<List<Integer>>result = new ArrayList<>();
        if(root == null)
        {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<> () ;
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size() ;
            List<Integer> current = new ArrayList<> () ;

            for(int i = 0 ; i < size ; i++)
            {
                TreeNode CurrentNode = q.poll() ;
                current.add(CurrentNode.value);

                if(CurrentNode.left != null)
                {
                    q.add(CurrentNode.left);
                }

                if(CurrentNode.right != null)
                {
                    q.add(CurrentNode.right);
                }
            }

            result.add(current);

        }
        Collections.reverse(result);

        return result ;
    }
}