package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.햄버거만들기;
import org.junit.jupiter.api.Test;

public class 햄버거만들기Test {
    private final 햄버거만들기 burger = new 햄버거만들기();

    @Test
    void solution() {
        int[] ingerdient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 2;
        int result = burger.solution(ingerdient);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void solution2() {
        int[] ingerdient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 2;
        int result = burger.solution(ingerdient);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
