class Solution {
    public int solution(int n) {
        
        String str = Integer.toString(n, 3);
        
        String revers = new StringBuilder(str).reverse().toString();
        
        return Integer.parseInt(revers, 3);
    }
}