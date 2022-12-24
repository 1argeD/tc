package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.귤고르기;
import org.junit.jupiter.api.Test;

public class 귤고르기Test {
    private final 귤고르기 mandarin = new 귤고르기();

    @Test
    void solution() {
        int k = 6;
        int[] tangerine = {1,3,2,5,4,5,2,3};
        int answer = 3;
        int result = mandarin.solution(k, tangerine);
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2() {
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        int answer = 2;
        int result = mandarin.solution(k, tangerine);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
