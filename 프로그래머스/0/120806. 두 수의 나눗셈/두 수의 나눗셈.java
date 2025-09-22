class Solution {
    
    private final int MIN = 0;
    private final int MAX = 100;
    
    public int solution(int num1, int num2) {
        int answer = 0;
        double result = 0.0;
        
        if(checkArithmetic(checkLimit(num1)) && checkArithmetic(checkLimit(num2))){
            result = ((double)num1 / num2) * 1000;
            return answer = (int)result;
        } else {
            return 0;    
        }
    }
    
    private double checkLimit(int num){
        
        return num = (MIN < num && num <= 100) ? num : 0;
    }
    
    private boolean checkArithmetic(double num){
        if (num == 0) {
            return false;
        }
        
        return true;
    }
    

}