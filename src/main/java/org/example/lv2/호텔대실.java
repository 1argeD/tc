package org.example.lv2;

import java.util.Arrays;
import java.util.PriorityQueue;

import static java.util.Arrays.sort;

public class 호텔대실 {
    public int solution(String[][] book_time) {
       sort(book_time, (a1,a2)-> transStringToInt(a1[0])-transStringToInt(a2[0]));

        PriorityQueue<Integer> time = new PriorityQueue<>();

        for(String[] book : book_time) {
            int checkIn = transStringToInt(book[0]);
            int checkOut = transStringToInt(book[1]);

            if(!time.isEmpty() && checkIn>=time.peek()+10) {
                time.poll();
            }
            time.add(checkOut);
        }

        return time.size();
    }

    private static int transStringToInt(String time) {
        String[] set = time.split(":");
        int h = Integer.parseInt(set[0]);
        int m = Integer.parseInt(set[1]);
        return h*60+m;
    }
}
