package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.둘만의암호;
import org.junit.jupiter.api.Test;

public class 둘만의암호Test {
    private final 둘만의암호 two = new 둘만의암호();

    @Test
    void solution() {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        String answer = "happy";
        String result = two.solution(s,skip,index);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
