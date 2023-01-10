package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.오픈채팅방;
import org.junit.jupiter.api.Test;

public class 오픈채팅방Test {
    private final 오픈채팅방 openChat = new 오픈채팅방();

    @Test
    void solution() {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};
        String[] answer = openChat.solution(record);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
