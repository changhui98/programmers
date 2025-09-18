import java.time.LocalDateTime;

class Solution {
    
    private final int MIN = 0;
    private final int MAX = 120;
    
    public int solution(int age) {
        
        int answer = checkLimit(age);
        
        return checkAge(answer);
    }
    
    private int checkLimit(int age){
        
        return age = (MIN < age && age <= MAX) ? age : 0;
    }
    
    private int checkAge(int age){
        
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = localDateTime.getYear();
        
        return (year - age)-2;
    }
}