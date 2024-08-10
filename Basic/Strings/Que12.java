

// Question Link :- https://leetcode.com/problems/integer-to-roman/description/



class Solution {
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] Convert = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX", "V", "IV", "I"};
    public String intToRoman(int num) {
        String roman = "" ;

        for(int  i = 0 ; i < values.length ; i++)
        {
            while (num >= values[i])
            {
                roman = roman + Convert[i] ;
                num = num - values[i] ;
            }
        }
        return roman ;
    }
}