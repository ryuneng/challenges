class Solution {
    public int solution(int[] numList) {
        int sum = 0;
        int mul = 1;
        
        for (int num : numList) {
            sum += num;
            mul *= num;
        }
        
        return (sum * sum) > mul ? 1 : 0;
    }
}