package org.example.lv2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/155651*/
public class 호텔대실 {
    public int solution(String[][] book_time) {
        Arrays.sort(book_time, (a1,a2)-> transStringToInt(a1[0])-transStringToInt(a2[0]));

        PriorityQueue<Integer> checking = new PriorityQueue<>();

        for(String[] book : book_time) {
            int checkIn = transStringToInt(book[0]);
            int checkOut = transStringToInt(book[1]);
            if(!checking.isEmpty() && checkIn>=checking.peek()+10) {
                checking.poll();
            }
            checking.add(checkOut);
        }
        return checking.size();
    }

    private static int transStringToInt(String time) {
        int H = Integer.parseInt(time.split(":")[0]);
        int M = Integer.parseInt(time.split(":")[1]);
        return H*60+M;
    }
}
