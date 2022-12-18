package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.푸드파이터;
import org.junit.jupiter.api.Test;

public class 푸드파이터Test {
    private final 푸드파이터 fighter = new 푸드파이터();

    @Test
    void solution() {
        int[] food = {1,3,4,6};
        String answer = "1223330333221";
        String result = fighter.solution(food);
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2() {
        int[] food = {1,7,1,2};
        String answer = "111303111";
        String result = fighter.solution(food);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
