package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.완주하지못한선수;
import org.junit.jupiter.api.Test;

import java.util.SplittableRandom;

public class 완주하지못한선수Test {
    private final 완주하지못한선수 parti = new 완주하지못한선수();

    @Test
    void solution(){
        String [] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String [] completion = {"josipa", "filipa", "marina", "nikola"};
        String answer = "vinko";
        String result = parti.solution(participant, completion);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
