package org.example.TC;

import java.lang.annotation.Retention;

public class 문자열밀기 {
    public int solution(String A, String B) {
        int answer = 0;
        String sA = A;
        for(int i = 0; i<sA.length(); i++) {
            if(sA.equals(B)){
                return answer;
            }
            /*subString()은 string 객체의 시작 인덱스로 부터 종료 인덱스 전 까지 문자열의 부분 문자열을 반환한다*/
            String a = sA.substring(sA.length()-1);/*여기서 a는 문자열 sA의 맨끝의 값을 반환한다*/
            sA = a + sA.substring(0,sA.length()-1);/*여기서 sA의 값은 위의 a값을 맨 앞으로 뒤에는 0번부터 끝까지를 붙여서 오른쪽으로 한 번 민다 */
            answer++;
        }
        return -1;
    }
}
