package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.이모티콘할인행사;
import org.junit.jupiter.api.Test;

public class 이모티콘할인행사Test {
    private final 이모티콘할인행사 emoticon = new 이모티콘할인행사();
    @Test
    void solution(){
        int[][] users = {{40, 10000}, {25, 10000}};
        int[] emoticons = {7000, 9000};
        int[] answer ={1, 5400};
        int[] result = emoticon.solution(users, emoticons);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void solution2() {
        int[][] users = {{40, 2900}, {23, 10000}, {11, 5200}, {5, 5900}, {40, 3100}, {27, 9200}, {32, 6900}};
        int[] emotions ={1300, 1500, 1600, 4900};
        int[] answer = {4, 13860};
        int[] result = emoticon.solution(users, emotions);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
