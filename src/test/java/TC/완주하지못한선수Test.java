package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.완주하지못한선수;
import org.junit.jupiter.api.Test;


public class 완주하지못한선수Test {
    private final 완주하지못한선수 parti = new 완주하지못한선수();

    @Test
    void solution(){
        String [] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = {"stanko", "ana", "mislav"};
        String answer = "mislav";
        String result = parti.solution2(participant, completion);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
