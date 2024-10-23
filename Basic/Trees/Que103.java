import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
 class TreeNode
 {
    int value ;
    TreeNode left ;
    TreeNode right ;

    // TreeNode() ;
    TreeNode(int value)
    {
        this.value = value ;
    }

    TreeNode(int value , TreeNode left , TreeNode right)
    {
        this.value = value; 
        this.left = left ;
        this.right = right ;  
    }
 };

class Solution 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) 
        {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (!q.isEmpty()) 
        {
            int size = q.size();
            List<Integer> current = new ArrayList<>();

            for (int j = 0; j < size; j++) 
            {
                TreeNode currentNode = q.poll();
                current.add(currentNode.value);

                if (currentNode.left != null) 
                {
                    q.add(currentNode.left);
                }
                if (currentNode.right != null) 
                {
                    q.add(currentNode.right);
                }
            }

            if (i % 2 == 0) 
            {
                Collections.reverse(current);
            }
            result.add(current);
            i++;
        }
        
        return result;
    }
}
