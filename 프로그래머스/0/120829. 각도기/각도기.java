class Solution {
    
    private final int MIN = 0;
    private final int MAX = 180;
    
    public int solution(int angle) {

        return protractor(checkLimit(angle));
    }
    
    private int checkLimit(int num){
        
        return num = (MIN < num && num <= MAX) ? num : 0;
    }
    
    private int protractor(int num){
        if (num == 180) {
            return 4;
        } else if(90 < num) {
            return 3;
        } else if(90 == num) {
            return 2;
        } else {
            return 1;
        }
    }
}