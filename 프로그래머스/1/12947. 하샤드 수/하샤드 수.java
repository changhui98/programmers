import java.util.Arrays;
import java.util.List;

class Solution {
    public boolean solution(int x) {
        
        int sum = 0;

        String str = String.valueOf(x);
        List<String> list = Arrays.asList(str.split(""));
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = Integer.parseInt(list.get(i));
            sum += arr[i];
        }
    
        
        return  x % sum == 0;
    }
}