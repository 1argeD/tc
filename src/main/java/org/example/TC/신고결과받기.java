package org.example.TC;

import java.util.HashMap;
import java.util.HashSet;

/*https://school.programmers.co.kr/learn/courses/30/lessons/92334*/
public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k ){
        HashMap<String , HashSet<String >> id = new HashMap<>();
        HashMap<String, Integer> reportList = new HashMap<>();
        int[] answer = new int[id_list.length];
        int c = 0;
        for(String list : id_list) {
            HashSet<String> p = new HashSet<>();
            id.put(list, p);
            reportList.put(list, c++);
        }

        for(String re : report) {
            String[] idx = re.split(" ");
            String to = idx[0];
            String from = idx[1];
            id.get(from).add(to);
        }

        for(String user : id_list) {
         HashSet<String > o = id.get(user);
         if(o.size()>=k) {
             for(String userId : o) {
                 answer[reportList.get(userId)]++;
             }
         }
        }
        return answer;
    }
}
