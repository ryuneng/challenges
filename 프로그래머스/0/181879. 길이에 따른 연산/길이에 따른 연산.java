class Solution {
    public int solution(int[] numList) {
        int sum = 0;
        int multiply = 1;
        int answer = 0;
        
        for (int num : numList) {
            if (numList.length >= 11) {
                sum += num;
                answer = sum;
            } else {
                multiply *= num;
                answer = multiply;
            }
        }
        
        return answer;
    }
}