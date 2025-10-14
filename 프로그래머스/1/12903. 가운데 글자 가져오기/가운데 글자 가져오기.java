class Solution {
    public String solution(String s) {
        
        boolean isEven = (s.length() % 2 == 0) ? true : false; 
        
        if (isEven) {
            return s.substring((s.length()/2)-1, (s.length()/2)+1);
        } else {
            return s.substring((s.length()/2), (s.length()/2)+1);
        }
    }
}