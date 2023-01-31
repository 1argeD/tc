package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.과일장수;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class 과일장수Test {
    private final 과일장수 fruit = new 과일장수();

    @Test
    void solution() {
        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};
        int answer = 8;
        int result = fruit.solution(k, m, score);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void solution2() {
        int k =4;
        int m =3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int answer = 33;
        int result = fruit.solution(k,m,score);
        Assertions.assertThat(result).isEqualTo(answer);

    }
}
