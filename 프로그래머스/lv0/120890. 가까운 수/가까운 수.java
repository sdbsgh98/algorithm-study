import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] array2 = new int[array.length];
				Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
        	array2[i] = Math.abs(n - array[i]); 
        }
        Arrays.sort(array2); 
        for(int i = 0; i< array.length;i++) {
        	if(array[i] < n && array[i] == (n - array2[0])) {
        		answer = (n-array2[0]);
        		break;
        	}else if(array[i] >= n && array[i] == (n + array2[0])) {
        		answer = (n + array2[0]);
        		break;
        	}
        }
        return answer;
    }
}