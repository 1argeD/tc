package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.당구연습;
import org.junit.jupiter.api.Test;

public class 당구연습Test {
    당구연습 drill  = new 당구연습();

    @Test
    void solution() {
        int m =10;
        int n = 10;
        int startX = 3;
        int startY = 7;
        int[][] balls = {{7,7},{2,7},{7,3}};
        int[] answer = {52,37,116};
        int[] result = drill.solution(m,n,startX,startY,balls);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
