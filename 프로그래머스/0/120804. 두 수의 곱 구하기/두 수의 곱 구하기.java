class Solution {
    
    private final int MIN = 0;
    private final int MAX = 100;
    
    public int solution(int num1, int num2) {

        return mul(num1, num2);
    }
    
    private int checkLimit(int num){
        
        num = (MIN <= num && num <= MAX) ? num : 0;
        return num;
    }
    
    private int mul(int num1, int num2){
        
        return num1 * num2;
    }
}