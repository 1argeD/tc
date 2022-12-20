package org.example.lv2;

import java.util.*;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        Map<String, String> idNickname = new HashMap<>();/*특정 아이디를 사용중인 닉네임으 저장하기 위해서 Mao<>을 사용-키값과 닉네임을 동시에 사용하기 위함*/
        int count = 0; /*change 일 경우 카운트가 올라감(닉네임 변경시 카운트 증가) */

        for(int i=0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            if(info[0].equals("Leave")){
                continue;
            } else if (info[0].equals("Enter")) {
                idNickname.put(info[1], info[2]); /*put()은 key 값과 value 값을 저장함*/
            } else{
                idNickname.put(info[1], info[2]);
                count++;
            }
        }

        String[] answer = new String[record.length - count];
        int idx = 0;

        for(int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");
            String nickname = idNickname.get(info[1]);
            if(info[0].equals("Enter")) {
                answer[idx++] = nickname + "님이 들어왔습니다.";
            } else if (info[0].equals("Leave")) {
                answer[idx++] = nickname + "님이 나갔습니다.";
            }
        }
        return answer;
    }
}
