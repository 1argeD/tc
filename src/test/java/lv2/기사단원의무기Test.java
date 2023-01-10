package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.기사단원의무기;
import org.junit.jupiter.api.Test;

public class 기사단원의무기Test {
    private final 기사단원의무기 weapon = new 기사단원의무기();

    @Test
    void solution() {
        int number = 5;
        int limit = 3;
        int power = 2;
        int answer = 10;

        int result = weapon.solution(number, limit, power);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void solution2() {
        int answer = 21;
        int result = weapon.solution(10, 3, 2);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
