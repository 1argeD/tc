package org.example.lv2;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169199*/
public class 리코쳇로봇 {
    public int solution(String[] board) {
        int answer = 0;
        int[] standard = {0, 0};
        int[] move = {-1, 1, 1, -1};
        int[] position = {0, board.length};
        for(String s : board) {
            int k = s.split("").length;
            position = new int[] {k, board.length};
        }


        return answer;
    }
}
