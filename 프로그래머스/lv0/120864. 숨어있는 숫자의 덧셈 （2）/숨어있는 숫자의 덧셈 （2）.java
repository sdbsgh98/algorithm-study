class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] split = my_string.split("[a-zA-z]+");
        
        for(int i = 0; i < split.length; i++) {
            if(split[i].matches("[0-9]+")) {
                answer += Integer.parseInt(split[i]);
            }
        }
        return answer;
    }
}