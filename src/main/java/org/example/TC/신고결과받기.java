package org.example.TC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92334*/
public class 신고결과받기 {
/*HashSet<>이란 변수를 선언하는 방법으로 이번 문제 중복된 신고를 허용하지 않음으로 HashSet<>을 사용한다.
* HashSet<>은 Set인터페이스에서 지원하는 구현 클래스로 순서대로 입력되지 않고, 일정하게 유지 된다.
* null 값을 허용하며, 중복을 허용하지 않아 이 문제에 사용하기 적합하다.*/
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> id = new HashMap<>();
        HashMap<String, Integer> reportList = new HashMap<>();

        int[] answer = new int[id_list.length];

        for(int i=0; i<id_list.length; i++) {
            HashSet<String> nick = new HashSet<>();
            id.put(id_list[i], nick);
            reportList.put(id_list[i], i);
        }
        
        for(String s : report) {
            String[] str = s.split(" ");
            String from = str[0];
            String to = str[1];
            id.get(to).add(from);
        }

        for(int i = 0; i< id_list.length; i++){
            HashSet<String>o = id.get(id_list[i]);
            if(o.size() >= k) {
                for(String userId : o) {
                    answer[reportList.get(userId)]++;
                }
            }
        }
        return answer;
    }

}
