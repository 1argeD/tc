package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.세균증식;
import org.junit.jupiter.api.Test;

public class 세균증식Test {

    private final 세균증식 germ = new 세균증식();

    @Test
    void solution(){
        int result = germ.solution(2, 10);
        int answer = 2048;
        Assertions.assertThat(result).isEqualTo(answer);

    }

}
