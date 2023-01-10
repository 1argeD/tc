package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.삼총사;
import org.junit.jupiter.api.Test;

public class 삼총사Test {
    private final 삼총사 three = new 삼총사();

    @Test
    void solution(){
        int[] number = {-2, 3, 0, 2,-5};
        int answer = 2;
        int result = three.solution(number);
        Assertions.assertThat(result).isEqualTo(answer);
    }
    @Test
    void solution2() {
        int[] number = {-3,-2,-1,0,1,2,3};
        int answer = 5;
        int result = three.solution(number);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
