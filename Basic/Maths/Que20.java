
//Question Link :- https://leetcode.com/problems/valid-parentheses/

public class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char pr : s.toCharArray()) 
        {
            if (pr == '(')
            {
                stack.push(')');
            }

            else if (pr == '[')
            {
                stack.push(']');
            }

            else if (pr == '{')
            {
                stack.push('}');
            }

            else if (stack.isEmpty() || stack.pop() != pr)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}