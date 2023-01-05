package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.개인정보수집유효기간;
import org.junit.jupiter.api.Test;

public class 개인정보수집유효기간Test {
    private final 개인정보수집유효기간 privacy = new 개인정보수집유효기간();

    @Test
    void solution() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] result = privacy.solution(today, terms, privacies);
        int[] answer = {1,3};
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
