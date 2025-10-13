import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int[] noReturn = {-1};
        int min = 0;
        
        if(arr.length == 1){
            return noReturn;
        } else {
            min = arr[0];    
        }
        
        List<Integer> arrList = new ArrayList<>();
        
        
        
        for(int i =0; i < arr.length; i++){
            
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            
            if(min < arr[i]){
                arrList.add(arr[i]);
            }
        }
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++){
            answer[i] = arrList.get(i).intValue();
        }
        
        return answer;
    }
}