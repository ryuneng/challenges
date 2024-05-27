class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        // s번째 전까지 my_string 출력
        String startStr = my_string.substring(0, s);
        // s + overwrite_string.length() 번째 이후의 my_string 출력
        String endStr = my_string.substring(s + overwrite_string.length());
        // 시작 문자열 + 덮어쓸 중간 문자열 + 끝 문자열
        answer = startStr + overwrite_string + endStr;
        
        return answer;
    }
}