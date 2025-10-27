class Solution {
    public int solution(String t, String p) {
        
        if(t.startsWith("0") || p.startsWith("0")){
            return 0;
        }
        
        int answer = 0;
        
        for(int i = 0; i <= t.length() - p.length(); i++){
            
            String piece = t.substring(i, i + p.length());
            
            if(Long.parseLong(piece) <= Long.parseLong(p)){
                answer++;
            }
            
        }
        
        return answer;
    }
}