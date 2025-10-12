class Solution {
    public String solution(String phone_number) {
        
        String hidden = "";
        String number = phone_number.substring(phone_number.length()-4);
        
        for(int i = 0; i < phone_number.length()-4; i++){
            hidden += "*";
        }
        
        return hidden+number;
    }
}