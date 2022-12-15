package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.저주의숫자;
import org.junit.jupiter.api.Test;

public class 저주의숫자Test {

    private final 저주의숫자 curse = new 저주의숫자();

    @Test
    void solution() {
        int x3 = curse.solution(15);
        int answer = 25;
        Assertions.assertThat(x3).isEqualTo(answer);
    }
}
