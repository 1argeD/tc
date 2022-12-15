package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.다음에올숫자;
import org.junit.jupiter.api.Test;

public class 다음에올숫자Test {
    private final 다음에올숫자 next = new 다음에올숫자();

    @Test
    void case1() {
        int[] common = {1,2,3,4};
        int result = next.solution(common);
        int answer = 5;
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void case2() {
        int[] common = {2,4,8};
        int result = next.solution(common);
        int answer = 16;
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
