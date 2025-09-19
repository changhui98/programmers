class Solution {
    
    private final int MIN = 0;
    private final int MAX = 10_000;
    
    public int solution(int num1, int num2) {
        
        return equals(checkLimit(num1), checkLimit(num2));
    }
    
    private int checkLimit(int num){
        
        return num = (MIN <= num && num <= 10000) ? num : 0;
    }
    
    private int equals(int num1, int num2){
        
        if (num1 == num2){
            return 1; 
        }
        return -1;
    }
}