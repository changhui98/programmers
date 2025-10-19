class Solution {
    public boolean solution(String s) {
        
        char[] str = s.toCharArray();
        
        if(!(str.length == 4 || str.length == 6)){
            return false;
        }
        
        for(int i = 0; i < str.length; i++){
            
            if (str[i] >= '0' && str[i] <= '9'){
                
            } else {
                return false;
            }
        }
        
        return true;
    }
}