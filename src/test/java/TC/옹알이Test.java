package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.옹알이;
import org.junit.jupiter.api.Test;

public class 옹알이Test {

    private final 옹알이 ong = new 옹알이();

    @Test
    void solution() {
       String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        int result = ong.solution(babbling);
        int answer = 3;
        Assertions.assertThat(result).isEqualTo(answer);
    }

}
