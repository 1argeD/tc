package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.가운데값반환하기;
import org.junit.jupiter.api.Test;

public class 가운데값반환하기Test {
    private final 가운데값반환하기 middle = new 가운데값반환하기();

    @Test
    void 홀수일때() {
        String s = "asdfg";
        String answer = "d";
        String result = middle.solution(s);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void 짝수일때() {
        String s = "qwer";
        String answer = "we";
        String result = middle.solution(s);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
