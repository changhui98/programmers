class Solution {
    public int solution(int num1, int num2) {
        
        return checkLimit(num1) - checkLimit(num2);
    }
    
    private int checkLimit(int num){
        if (-50000 >= num && num >= 50000){
            return 0;
        }
        return num;
    }
}