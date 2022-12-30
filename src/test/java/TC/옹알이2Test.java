package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.옹알이2;
import org.junit.jupiter.api.Test;

public class 옹알이2Test {
    private final 옹알이2 ong2 = new 옹알이2();

    @Test
    void setOng2() {
        String[] babbling = {"aya", "yee", "u", "maa"};
        int result = 1;
        int answer = ong2.solution(babbling);
        Assertions.assertThat(answer).isEqualTo(result);
    }
    @Test
    void  setOng22() {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int result = 2;
        int answer = ong2.solution2(babbling);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
