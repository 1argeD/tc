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
            answer = clear(board);
        }
        return answer;
    }

    public String success(String[] board) {
        String[] answer = {"yes", "no"};
        String a = "";
        ArrayList<String> ary = new ArrayList<>(Arrays.asList(board));
        int g = 0;
        int l = 0;
        for (int findG=0; findG<ary.size(); findG++) {
            if (ary.get(findG).contains("G")) {
                for (int k = 0; k < ary.get(findG).split("").length; k++) {
                    g = findG;
                    if(ary.get(findG).split("")[k].matches("G")) {
                        l = k;
                    }
                    if(g==0) {
                        return answer[0];
                    } else if(g==ary.size()-1) {
                        return answer[0];
                    } else if(ary.get(findG).split("")[0].matches("G")) {
                        return answer[0];
                    } else if(ary.get(findG).split("")[ary.get(findG).split("").length-1].matches("G")) {
                        return answer[0];
                    }
                }
            }
        }
        if(ary.get(g-1).split("")[l].matches("D")) {
            a = answer[0];
        } else if(ary.get(g+1).split("")[l].matches("D")) {
            a = answer[0];
        } else if(ary.get(g).split("")[l].matches("D")) {
            a = answer[0];
        } else {
            a = answer[1];
        }
        return a;
    }


    public int clear(String[] board) {
        int a = 0;
        return a;
    }


}
