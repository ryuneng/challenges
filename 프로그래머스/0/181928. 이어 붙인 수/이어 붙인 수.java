class Solution {
    public int solution(int[] numList) {
        String oddNum = "";
        String evenNum = "";
        
        for (int i : numList) {
            if (i % 2 == 0) {
                evenNum += String.valueOf(i);
            } else {
                oddNum += String.valueOf(i);
            }
        }
        
        return Integer.parseInt(oddNum) + Integer.parseInt(evenNum);
    }
}