class Solution {
    
    public double solution(int[] arr) {
        
        int count = 0;
        double sum = 0.0;
        
        for(int number : arr) {
            sum += number;
            count++;
        }
        
        return sum / count;
    }
}