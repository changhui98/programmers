class Solution {
    
    private final int MIN = 0;
    private final int MAX = 1_000;
    
    public int solution(int n) {

        return sumEven(checkLimit(n));
    }
    
    private int checkLimit(int num){
        
        return num = (MIN < num && num <= MAX) ? num : 0;
    }
    
    private int sumEven(int num) {
        int sum = 0;
        
        for (int i =0; i<=num; i++){
            
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }
}