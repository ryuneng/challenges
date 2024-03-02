import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();	// 출력할 결과물을 저장할 StringBuilder

        Stack<Integer> stack = new Stack<>();

        // 수열의 길이가 될 숫자를 입력받는다.
        int n = Integer.parseInt(br.readLine());

        int start = 0;

        // n번 반복
        while(n-- > 0) {

            // 수열의 항에 해당하는 정수들을 중복되지 않게 순서대로 입력받는다.
            int value = Integer.parseInt(br.readLine());

            // 1. value가 start보다 큰 경우
            if(value > start) {
                // start + 1부터 입력받은 value 까지 push
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');    // + 를 sb에 저장
                }
                start = value;  // 다음 push 할 때의 오름차순을 유지하기 위한 변수 초기화
            }

            // 2. top에 있는 원소가 입력받은 값과 같지 않은 경우
            else if(stack.peek() != value) {
                System.out.println("NO");
                return;		// 또는 System.exit(0); 으로 대체해도 됨.
            }

            // 3. 입력받은 값(최상단 데이터)을 추출해야 하므로 pop
            stack.pop();
            sb.append('-').append('\n');    // - 를 sb에 저장

        }

        System.out.println(sb);
    }
}