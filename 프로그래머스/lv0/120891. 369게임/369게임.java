class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = "" + order;
        
        for(int i = 0; i < orderStr.length(); i++) {
            char tempChar = orderStr.charAt(i);
            
            if(tempChar == '3' || tempChar == '6' || tempChar == '9') {
                answer++;
            }
        }
        return answer;
    }
}