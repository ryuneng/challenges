class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        String ab = String.valueOf(sb.append(a).append(b));
        int num = Integer.parseInt(ab);
        
        int mul = 2 * a * b;
        
        if (num > mul) {
            return num;
        } else if (num < mul) {
            return mul;
        }
        
        return num;
    }
}