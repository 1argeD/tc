package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.당구연습;
import org.junit.jupiter.api.Test;

public class 당구연습Test {
    당구연습 drill  = new 당구연습();

    @Test
    void solution() {
        int m =4;
        int n = 2;
        int startX = 1;
        int startY = 1;
        int[][] balls = {{1,2}};
        int[] answer = {5};
        int[] result = drill.solution(m,n,startX,startY,balls);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
