package stack_queue.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> q = new LinkedList<>(); // Queue인터페이스의 구현체인 LinkedList
        int maxHistorySize = 3; // 최근 접속 사이트 최대 갯수

        // 무한반복문 실행
        while (true) {
            System.out.print("# 접속할 사이트명을 입력하세요 > ");
            // 1. 접속할 사이트 입력받기
            String str = br.readLine();
            // 2. 접속 사이트를 Queue에 저장
            q.offer(str);

            // 3. maxHistorySize 이상의 사이트 접속 시 제일 처음 입력된 데이터를 삭제
            if (q.size() > maxHistorySize) {
                System.out.println("(삭제된 기록 : " + q.peek() + ")");
                q.remove();
            }
            // 4. Queue를 LinkedList로 변환한 후 모든 원소 출력
            LinkedList list = (LinkedList) q;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                System.out.println(i + 1 + ". " + list.get(i));
            }
            System.out.println();
        }
    }
}
