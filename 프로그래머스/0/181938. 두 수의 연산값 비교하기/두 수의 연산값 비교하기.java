class Solution {
    public int solution(int a, int b) {
        int num = Integer.parseInt("" + a + b);
        int mul = 2 * a * b;
        
        return Math.max(num, mul);
    }
}