package org.example.lv2;

import java.time.LocalTime;
import java.util.Comparator;
import java.util.PriorityQueue;

import static java.util.Arrays.*;

public class 호텔대실 {
    public int solution(String[][] book_time) {
        // 시작 시간 기준으로 정렬하되, 시작 시간이 같으면 종료 시간 기준으로 정렬
        sort(book_time, Comparator.comparing((String[] a) -> a[0]).thenComparing(a -> a[1]));

        PriorityQueue<LocalTime> checkoutTimes = new PriorityQueue<>();

        for (String[] reservation : book_time) {
            LocalTime checkIn = LocalTime.parse(reservation[0]);
            LocalTime checkOut = LocalTime.parse(reservation[1]).plusMinutes(10);
            if (!checkoutTimes.isEmpty() && !checkIn.isBefore(checkoutTimes.peek())) {
                checkoutTimes.poll();
            }
            checkoutTimes.add(checkOut);
        }

        return checkoutTimes.size();
    }
}
