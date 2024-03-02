package stack_queue.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class StackQueue {
    private static String now = "";                       // 현재페이지를 저장할 문자열
    private static Stack<String> back = new Stack<>();    // 이전페이지를 저장할 스택
    private static Stack<String> forward = new Stack<>(); // 다음페이지를 저장할 스택

    // 0. 메인메서드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        for (int i=1; i<=3; i++) {
            System.out.print("# " + i + "번째로 이동할 사이트명을 입력하세요 > ");
            String site = br.readLine(); // 1) 이동할 사이트 입력받기
            go(site);                    // 2) 입력받은 사이트로 접속 메서드 실행
            history();                   // 3) 방문기록 메서드 실행
            System.out.println();
        }

        System.out.println("\n###");
        System.out.println("<--- 뒤로가기 실행");
        undo();                          // 4) 뒤로가기 메서드 실행
        history();                       //    방문기록 메서드 실행

        System.out.println("\n ---> 앞으로가기 실행");
        redo();                          // 5) 앞으로가기 메서드 실행
        history();                       //    방문기록 메서드 실행

        // 한 번 더 이동하기
        System.out.print("\n# 한 번 더 이동할 사이트명을 입력하세요 > ");
        String site = br.readLine();
        go(site);
        history();
    }

    // 1. 브라우저 접속 메서드
    public static void go(String site) {
        System.out.println(site + "(으)로 접속합니다. ");
        if(!"".equals(now) && now != null) { // now(현재페이지)가 비어있지 않다면 (최초 접속이 아니라면)
            back.push(now);                  // 1) back Stack(이전페이지)에 now를 저장
        }
        now = site;                          // 2) now(현재페이지)에 site(메서드 실행 시 입력받을 이동할 사이트)를 저장
    }

    // 2. 뒤로가기 메서드
    public static void undo() {
        if(!back.isEmpty()) {  // back Stack 이 비어있지 않다면(뒤로 갈 페이지가 있다면) 아래 코드 실행
            forward.push(now); // 1) forward Stack(다음페이지)에 now(현재페이지)를 저장
            now = back.pop();  // 2) now에는 back Stack의 이전페이지(맨 위 데이터)를 꺼내서 대입
        }
    }

    // 3. 앞으로가기 메서드
    public static void redo() {
        if(!forward.isEmpty()) { // forward Stack 이 비어있지 않다면(앞으로 갈 페이지가 있다면) 아래 코드 실행
            back.push(now);      // 1) back Stack(이전페이지)에 now(현재페이지)를 저장
            now = forward.pop(); // 2) now에는 forward Stack의 다음페이지(맨 위 데이터)를 꺼내서 대입
        }
    }

    // 4. 방문기록 메서드
    public static void history() {
        System.out.println("- 이전페이지 : " + back);
        System.out.println("- 현재페이지 : " + now);
        System.out.println("- 다음페이지 : " + forward);
    }
}

/*
 * 메인메서드 실행 결과
    # 1번째로 이동할 사이트명을 입력하세요 > 네이버
    네이버(으)로 접속합니다.
    - 이전페이지 : []
    - 현재페이지 : 네이버
    - 다음페이지 : []

    # 2번째로 이동할 사이트명을 입력하세요 > 다음
    다음(으)로 접속합니다.
    - 이전페이지 : [네이버]
    - 현재페이지 : 다음
    - 다음페이지 : []

    # 3번째로 이동할 사이트명을 입력하세요 > 구글
    구글(으)로 접속합니다.
    - 이전페이지 : [네이버, 다음]
    - 현재페이지 : 구글
    - 다음페이지 : []


    ###
    <--- 뒤로가기 실행
    - 이전페이지 : [네이버]
    - 현재페이지 : 다음
    - 다음페이지 : [구글]

     ---> 앞으로가기 실행
    - 이전페이지 : [네이버, 다음]
    - 현재페이지 : 구글
    - 다음페이지 : []

    # 한 번 더 이동할 사이트명을 입력하세요 > 유튜브
    유튜브(으)로 접속합니다.
    - 이전페이지 : [네이버, 다음, 구글]
    - 현재페이지 : 유튜브
    - 다음페이지 : []
 */
