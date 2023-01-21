package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.이상한문자만들기;
import org.junit.jupiter.api.Test;

public class 이상한문자만들기Test {
    private final 이상한문자만들기 stranger = new 이상한문자만들기();

    @Test
    void solution() {
        String s = "try hello world";
        String answer = "TrY HeLlO WoRlD";
        String result = stranger.solution(s);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
