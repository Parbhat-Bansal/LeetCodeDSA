

// Question Link :-  https://leetcode.com/problems/integer-to-roman/description/

// This Approach is better ;

class Solution {
    public String intToRoman(int num) {
           String one[]={"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX"};
        String ten[]={"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String hun[]={"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String th []={"", "M", "MM", "MMM"};

        StringBuilder sb=new StringBuilder();
        sb.append(th[num/1000]);
        sb.append(hun[(num%1000)/100]);
        sb.append(ten[(num%100)/10]);
        sb.append(one[num%10]);
        return sb.toString();
    }
}
