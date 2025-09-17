class Solution {
    
    private final int MIN = 0;
    private final int MAX = 100;
    
    public int solution(int num1, int num2) {
        
        return div(num1, num2);
    }
    
    private int checkLimit(int num){
        
        return num = (MIN <= num && num <= MAX) ? num : 0;
    }
    
    private int div(int num1, int num2){
        
        return num1 / num2;
    }
}