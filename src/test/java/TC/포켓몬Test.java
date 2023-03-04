package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.포켓몬;
import org.junit.jupiter.api.Test;

public class 포켓몬Test {
    포켓몬 pocket = new 포켓몬();
    @Test
    void solution () {
        int[] nums = {3,3,3,2,2,2};
        int answer = 2;
        int result = pocket.solution(nums);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
