package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.연속된수의합;
import org.junit.jupiter.api.Test;

public class 프로그래머스Test {

    private final 연속된수의합 pro = new 연속된수의합();

    @Test
    void solution() {
        int[] result = pro.solution(4, 14);
        int[] answer = {2,3,4,5};
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
