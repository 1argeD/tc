package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.성격유형검사;
import org.junit.jupiter.api.Test;

public class 성격유형검사Test {
    성격유형검사 identityTest = new 성격유형검사();

    @Test
    void solution() {
        String[] survey = {"TR", "RT", "TR"};
        int[] choice = {7, 1, 3};
        String answer = "RCJA";
        String result = identityTest.solution(survey, choice);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
