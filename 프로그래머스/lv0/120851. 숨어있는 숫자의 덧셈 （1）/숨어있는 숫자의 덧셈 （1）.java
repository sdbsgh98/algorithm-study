import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[a-z|A-z]", "").split(""))
            .mapToInt(Integer::parseInt)
            .sum();
    }
}