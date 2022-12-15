package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.종이자르기;
import org.junit.jupiter.api.Test;

public class 종이자르기Test {
    private 종이자르기 paper = new 종이자르기();

    @Test
    void solution() {
        int M = 2;
        int N = 2;
        int answer = 3;
        int result = paper.solution(M,N);
        Assertions.assertThat(result).isEqualTo(answer);
    }
    @Test
    void solution2() {
        int answer = 0;
        int result = paper.solution(1,1);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
