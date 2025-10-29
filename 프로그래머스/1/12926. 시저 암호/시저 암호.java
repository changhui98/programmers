class Solution {
    public String solution(String s, int n) {
        
        StringBuilder answer = new StringBuilder();
        char[] str = s.toCharArray();
        
        for (int i = 0; i < str.length; i++){
            char c = str[i];
            
            if (c == ' '){
                answer.append(c);
                continue;
            }
            
            if (Character.isUpperCase(c)){
                    
                answer.append((char) ((c - 'A' + n) % 26 + 'A'));
            } 
            else if (Character.isLowerCase(c)){
                
                answer.append((char) ((c - 'a' + n) % 26 + 'a'));
            }
        }    
    
        return answer.toString();
    }
}