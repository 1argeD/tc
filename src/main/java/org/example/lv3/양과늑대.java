package org.example.lv3;

import java.util.*;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92343*/
public class 양과늑대 {
    static ArrayList<Integer>[] children;
    static int[] Info;
    static int MAXIMUM=0;
    public int solution(int[] info, int[][] edges) {
        Info = info;
        children = new ArrayList[info.length];
        for(int[] i : edges) {
            int parent = i[0];
            int child = i[1];
            if(children[parent] == null) {
                children[parent] = new ArrayList<>();
            }
            children[parent].add(child);
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        dfs(0,0,0,list);
        return MAXIMUM;
    }

    private static void dfs(int idx,int sheepCnt, int wolfCnt, List<Integer> nextPos) {
            if(Info[idx] == 0) {
                sheepCnt++;
            } else {
                wolfCnt++;
            }

            if(wolfCnt>=sheepCnt) return;
            MAXIMUM = Math.max(sheepCnt, MAXIMUM);

        List<Integer> list = new ArrayList<>(nextPos);
            list.remove(Integer.valueOf(idx));

            if(children[idx] != null) {
                list.addAll(children[idx]);
            }

            for(int next : list) {
                dfs(next, sheepCnt,wolfCnt, list);
            }
    }
}
