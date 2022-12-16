package org.example.TC;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120871?language=java*/
public class 저주의숫자 {
    public int solution(int n) {
        int x3 = 0;
        for(int i = 1; i<=n; i++) {
            x3++;
            /*contains() 문자열에 특정 문자열이 포함 되어 있는지 확인하는 함수*/
            /*논리연산자 || 는 or이라는 뜻을 갖고 있음. 두가지 중 하나라도 true일 경우 true를 반환한다*/
            while (x3 % 3 == 0 || String.valueOf(x3).contains("3")) {
                x3++;
            }
        }
        return x3;
    }
}
