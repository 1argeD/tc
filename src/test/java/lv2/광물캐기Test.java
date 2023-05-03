package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.광물캐기;
import org.junit.jupiter.api.Test;

public class 광물캐기Test {
    광물캐기 mine = new 광물캐기();

    @Test
    void solution() {
        int[] picks = {0, 1, 1};
        String[]  minerals= {"diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"};
        int result = mine.solution(picks, minerals);
        int answer = 50;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
