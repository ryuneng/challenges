import java.util.stream.IntStream;

class Solution {
    public int[] solution(int startNum, int endNum) {
        return IntStream.rangeClosed(startNum, endNum).toArray();
    }
}