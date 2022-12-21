package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.영어가싫어요;
import org.junit.jupiter.api.Test;

public class 영어가싫어요Test {
    private final 영어가싫어요 hateEnglish = new 영어가싫어요();

    @Test
    void solution() {
        String numbers = "onetwothreefourfivesixseveneightnine";
        long result = hateEnglish.solution(numbers);
        long answer  = 123456789;
        Assertions.assertThat(answer).isEqualTo(result);
    }

    @Test
    void solution2(){
        String numbers = "onefourzerosixseven";
        long result = hateEnglish.solution(numbers);
        long answer  = 14067;
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
