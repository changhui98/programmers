class Solution {
    public String solution(int n) {
        
        String answer = "";

        boolean isEven = 
            n % 2 == 0 
            ? true
            : false;
        
        if(n == 1) {
            return "수";
        }
        
        if (isEven) {
            for(int i = 0; i < n / 2; i++) {
                answer += "수" + "박";
            }
        } else {
            for(int i = 0; i < n / 2; i++) {
                answer += "수" + "박";
            }
            answer += "수";
        }
        
        
        return answer;
    }
}
