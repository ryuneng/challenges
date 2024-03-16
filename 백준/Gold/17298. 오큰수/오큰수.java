import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<Integer>(); // 오큰수 찾는 과정을 담을 스택 생성

        int N = Integer.parseInt(br.readLine()); // 입력받을 수열의 크기
        int[] seq = new int[N]; // 수열의 원소들을 담을 배열 생성

        // 입력받은 원소들을 띄어쓰기로 구분해 하나씩 분할
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 배열에 원소들 저장
        for (int i = 0; i < N; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        // 수열을 차례대로 탐색
        for (int i = 0; i < N; i++) {
            // 스택이 비어있지 않고, 스택의 최상단 값이 현재 인덱스의 값보다 작을 동안(현재 인덱스의 값보다 큰 수가 나오기 전까지)
            // 스택 최상단 값을 pop하면서 배열에서의 그 최상단 값을 현재 인덱스의 값으로 치환
            while (!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }

            // while문을 빠져나온 후 현재 원소 값을 스택에 push
            stack.push(i);
        }

        // stack에 남아있는 인덱스의 값들은 더이상 뒤에 큰 수가 없기 때문에, -1값으로 치환
        while (!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();	// 출력할 결과물을 저장할 StringBuilder
        for (int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }

        System.out.println(sb);
    }
}
