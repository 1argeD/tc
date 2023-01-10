package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.명예의전당;
import org.junit.jupiter.api.Test;

public class 명예의전당Test {
    private final 명예의전당 temple = new 명예의전당();

    @Test
    void solution() {
        int k = 3;
        int[] score = {10,100,20,150,1,100,200};
        int[] answer = {10,10,10,20,20,100,100};
        int[] result = temple.solution(k, score);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
