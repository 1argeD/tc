package org.example.lv2;

public class 호텔대실 {
    public int solution(String[][] book_time) {
        int roomCNT = book_time.length;

        for(int i=0; i<book_time.length; i++) {
            for(int j =0; j<book_time.length; j++) {
                if(Integer.parseInt(String.valueOf(book_time[i][1].split(":")[0])) < Integer.parseInt(String.valueOf(book_time[j][0].split(":")[0]))) {
                    roomCNT--;
                    break;
                } else if((book_time[i][1].split(":")[0].equals(book_time[j][0].split(":")[0]))) {
                    if(Integer.parseInt(String.valueOf(book_time[i][1].split(":")[1]))+10<=Integer.parseInt(String.valueOf(book_time[j][0].split(":")[1]))) {
                        roomCNT--;
                    }
                }
            }
        }
        return roomCNT;
    }
}
