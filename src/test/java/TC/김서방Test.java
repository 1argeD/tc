package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.김서방;
import org.junit.jupiter.api.Test;

public class 김서방Test {
    private final 김서방 kim = new 김서방();

    @Test
    void solution() {
        String[] seoul = {"Jane", "Kim"};
        String answer = "김서방은 1에 있다";
        String result = kim.solution(seoul);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
