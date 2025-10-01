class Solution {
    public int[] solution(long n) {
        
        int count = 0;
        String inputNumber = String.valueOf(n);
        int[] answer = new int[inputNumber.length()];
        
        for(int i = inputNumber.length()-1; i >= 0; i--){
            answer[count] = Integer.parseInt(inputNumber.substring(i, i+1));
            count++;
        }
        
        
        return answer;
    }
}