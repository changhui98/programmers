class Solution {
    public long solution(int a, int b) {
        
        long answer = 0;
        
        if(a==b){
            return a;
        }
        
        for(int i = checkMin(a, b); i <= checkMax(a, b); i++){
            answer += i;
        }

        return answer;
    }
    
    private int checkMax(int a, int b){
        
        return a < b ? b : a;
    }
    
    private int checkMin(int a, int b){
        
        return a < b ? a : b;
    }
}