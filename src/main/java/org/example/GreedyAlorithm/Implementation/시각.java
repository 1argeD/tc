package org.example.GreedyAlorithm.Implementation;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/*정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하세요.
예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각입니다.
00시 00분 03초
00시 13분 30초
반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각입니다.
00시 02분 55초
01시 27분 45초*/
public class 시각 {
    public static int solution(int time) {
        int answer = 0;
        for(int i=0; time+1>i; i++) {
            for(int j=0; 60>j; j++) {
                for(int k=0; 60>k; k++) {
                    if(String.valueOf(i).contains("3")||String.valueOf(j).contains("3")||String.valueOf(k).contains("3")) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int time = 5;
        int answer = 11475;
        int result = solution(time);
        if(answer==result){System.out.println("정답입니다");}
        else {System.out.println("오답입니다.");};
    }
}
