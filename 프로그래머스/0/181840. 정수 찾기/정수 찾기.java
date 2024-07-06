class Solution {
    public int solution(int[] arr, int n) {
        int answer = 0;
        for (int a : arr) {
            if (a == n) {
                answer = 1;
            }
        }
        return answer;
    }
}