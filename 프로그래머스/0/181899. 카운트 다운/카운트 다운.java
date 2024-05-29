class Solution {
    public int[] solution(int start, int endNum) {
        int[] answer = new int[start - endNum + 1];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start - i;
        }
        
        return answer;
    }
}