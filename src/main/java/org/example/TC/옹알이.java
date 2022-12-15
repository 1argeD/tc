package org.example.TC;


/*https://school.programmers.co.kr/learn/courses/30/lessons/120956*/
public class 옹알이 {
    public int solution(String[] babbling) {
        int answer = 0;

        String[] joka = {"aya", "ye", "woo", "ma"};
        String[] read = babbling;

        for (int i = 0; i < read.length; i++) {

            for (int j = 0; j < joka.length; j++) {

                read[i] = read[i].replace(joka[j], "★");
                if (read[i].replace("★", "").equalsIgnoreCase("")) {
                    answer++;
                    break;
                }

            }

        }
        return answer;
    }
}

