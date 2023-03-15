package TC;

import com.sun.tracing.dtrace.ArgsAttributes;
import org.assertj.core.api.Assertions;
import org.example.TC.다트게임;
import org.junit.jupiter.api.Test;

public class 다트게임Test {
    다트게임 dartGame = new 다트게임();

    @Test
    void solution() {
    String dartResult = "1D2S#10S";
    int result = 9;
    int answer = dartGame.solution(dartResult);
    Assertions.assertThat(answer).isEqualTo(result);
    }
}
