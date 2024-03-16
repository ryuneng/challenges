import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>(); // Queue인터페이스의 구현체인 LinkedList

        // 1. 숫자 입력 받기
        int N = Integer.parseInt(br.readLine());

        // 2. 1부터 입력받은 숫자까지의 값을 차례대로 Queue에 저장
        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        // 3. q의 사이즈가 1보다 클동안 내부 코드 반복
        while (q.size() > 1) {
            q.poll(); // 최상단 값 제거
            q.offer(q.poll()); // 그다음 최상단 값 제거와 동시에, 그 제거된 값을 하단에 삽입
        }

        System.out.println(q.poll());
    }
}