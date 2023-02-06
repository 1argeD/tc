package org.example.TC;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Collections.sort;

/*https://school.programmers.co.kr/learn/courses/30/lessons/42576#qna*/
/*리스트의 경우 삭제를 하기 위해서는 리스트에 해당 값이 있는지 확인하기 위해서 배열을 탐색하는데
* LinkedList 는 ArrayList 보다 삭제 속도는 빠르지만 탐색 속도는 느리기 때문에 배열을 정리해주고 풀면 통과가 가능하다
* 하지만 해쉬 문제이기 때문에 HashMap을 통해서 풀어볼 것! */
public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList(participant));
        sort(list);
        Arrays.sort(completion);
        for(String com : completion) list.remove(com);
        return list.getLast();
    }
}
