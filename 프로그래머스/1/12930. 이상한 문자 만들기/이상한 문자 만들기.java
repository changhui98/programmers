class Solution {
    public String solution(String s) {
        
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(char c : s.toCharArray()){
            
            if(c == ' '){
                
                answer += " ";
                idx = 0;
            }
            else {
                
                if(idx % 2 == 0) {
                    
                    answer += Character.toUpperCase(c);
                }
                else {
                    
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }
        return answer;
    }
}