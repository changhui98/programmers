class Solution {
    public int solution(int[][] sizes) {
        
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++){
            
            int max = Math.max(sizes[i][0], sizes[i][1]);
            int min = Math.min(sizes[i][0], sizes[i][1]);
            
            if(w < max){
                w = max;
            }
            
            if(h < min){
                h = min;
            }
        }
        return w * h;
    }
}