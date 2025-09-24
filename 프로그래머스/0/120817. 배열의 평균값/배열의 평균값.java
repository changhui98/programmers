class Solution {
    
    private final int MIN = 0;
    private final int MAX = 1000;
    private final int LIMIT = 100;
    
    
    public double solution(int[] numbers) {
        
        if(!(checkLength(numbers) || checkArgument(numbers))){
            return 0;
        }
        
        int sum = arraySum(numbers);
        double answer = averageArray(sum, numbers.length);
        
        return answer;
    }
    
    private boolean checkLength(int[] numbers){
        if(MIN < numbers.length && numbers.length <= LIMIT){
            return true;
        }
        return false;
    }
    
    private boolean checkArgument(int[] numbers){
        int errorCount = 0;
        
        for (int number : numbers){
            if(!(MIN <= number || number <= LIMIT)){
                errorCount++;
            }
        }
        if(!(errorCount == 0)){
            return false;
        }
        return true;
    }
    
    private int arraySum(int[] numbers){
        int sum = 0;
        
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    
    private double averageArray(int sum, int length){
        
        return (double)sum / length;
    }
}