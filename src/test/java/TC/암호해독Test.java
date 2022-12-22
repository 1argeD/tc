package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.암호해독;
import org.junit.jupiter.api.Test;

public class 암호해독Test {
    private final 암호해독 decoding = new 암호해독();

    @Test
    void solution() {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String answer = "attack";
        String result = decoding.solution2(cipher, code);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
