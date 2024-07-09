class Solution {
    public int solution(String numStr) {
        int answer = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            answer += Integer.parseInt(numStr.substring(i, i+1));
        }
        
        return answer;
    }
}