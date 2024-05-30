import java.util.*;

class Solution {
    public List solution(int[] numList) {
        List<Integer> answer = new ArrayList<>();
        
        int lastNum = numList[numList.length - 1];
        int prevNum = numList[numList.length - 2];

        for (int i : numList) {
            answer.add(i);
        }
        
        answer.add(numList.length, lastNum > prevNum ? lastNum - prevNum : lastNum * 2);
        
        return answer;
    }
}