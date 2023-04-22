package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.호텔대실;
import org.junit.jupiter.api.Test;

public class 호텔대실Test {
    호텔대실 hotel = new 호텔대실();

    @Test
    void solution() {
//        String[][] book_time = {{"09:10", "10:10"},{"10:20", "12:20"}};
        String[][] book_time = {{"15:00", "17:00"},{"16:40", "18:20"},{"14:20", "15:20"},{"14:10", "19:20"},{"18:20", "21:20"}};
        int answer = 3;
        int result = hotel.solution(book_time);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
