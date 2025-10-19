import java.util.*;

class Solution {
    public String solution(String s) {
        
        char[] newstr = s.toCharArray();
        
        Arrays.sort(newstr);
        
        StringBuilder sb = new StringBuilder(new String(newstr));
        
        return sb.reverse().toString();
    }
}