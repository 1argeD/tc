package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.디펜스게임;
import org.junit.jupiter.api.Test;

public class 디펜스게임Test {
    private final 디펜스게임 defence = new 디펜스게임();

    @Test
    void 클리어실패() {
        int[]enemy = {4,2,4,5,3,3,1};
        int result = defence.solution(7,3, enemy);
        int answer = 5;

        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void 클리어성공() {
        int[]enemy = {3,3,3,3};
        int result = defence.solution(2,4,enemy);
        int answer = 4;

        Assertions.assertThat(result).isEqualTo(answer);
    }
}
