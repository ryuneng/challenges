class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        if ("<".equals(ineq) && n < m) return 1;
        if (">".equals(ineq) && n > m) return 1;
        if ("=".equals(eq) && n == m) return 1;
        return 0;
    }
}