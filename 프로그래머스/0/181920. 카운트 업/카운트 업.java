class Solution {
    public int[] solution(int startNum, int endNum) {
        int[] answer = new int[endNum - startNum + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = startNum + i;
        }
        
        return answer;
    }
}