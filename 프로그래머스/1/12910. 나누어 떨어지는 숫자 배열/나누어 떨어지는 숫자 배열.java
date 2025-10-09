import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
    
        int[] fail = {-1};
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {
                count++;
                list.add(arr[i]);
            }
        }
        
        if(count ==0){
            return fail;
        }

        list.sort(Comparator.naturalOrder());
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}