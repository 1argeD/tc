package org.example.lv2;

import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;

import java.lang.reflect.AnnotatedType;
import java.util.ArrayList;
import java.util.Arrays;

/*https://school.programmers.co.kr/learn/courses/30/lessons/169199*/
public class 리코쳇로봇 {
    public int solution(String[] board) {
        int answer = 0;
        if(success(board).equals("no")) {
            answer = -1;
        } else {

        }
        return answer;
    }

    public String success(String[] board) {
        String[] answer = {"yes", "no"};
        String a = "";
        ArrayList<String> ary = new ArrayList<>(Arrays.asList(board));
        ArrayList<String[]>check = new ArrayList<>();
        int l = 0;
        for(int i=0; i<ary.size(); i ++) {
            if(ary.get(i).contains("G")) {
                check.add(ary.get(i).split(""));
                for(String[] c : check) {
                    l++;
                    if(Arrays.equals(c, new String[]{"G"})) {
                      break;
                    }
                }
            }
            check.add(ary.get(i-1).split(""));
            if(check.get(l).equals("D")) {
                a = answer[0];
            } else {
                check.add(ary.get(i+1).split(""));
                if(check.get(l).equals("D")) {
                     a = answer[0];
                } else {
                    a = answer[1];
                }
            }
        }
        return a;
    }


}
