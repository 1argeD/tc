package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.성격유형검사;
import org.junit.jupiter.api.Test;

public class 성격유형검사Test {
    성격유형검사 identity = new 성격유형검사();

    @Test
    void solution() {
        String [] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        String answer ="TCMA";
        String result = identity.solution(survey, choices);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
