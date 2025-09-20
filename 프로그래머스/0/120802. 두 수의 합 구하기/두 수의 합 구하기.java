class Solution {
    
    private final int MIN = -50_000;
    private final int MAX = 50_000;
    
    public int solution(int num1, int num2) {
      
        
        return checkLimit(num1) + checkLimit(num2);
    }
    
    private int checkLimit(int num){
        
        return num = (MIN <= num && num <= MAX) ? num : 0;
    }
}