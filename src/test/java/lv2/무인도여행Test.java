package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.무인도여행;
import org.junit.jupiter.api.Test;

public class 무인도여행Test {
    무인도여행 island = new 무인도여행();

    @Test
    void solution() {
         String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
         int[] answer = {1, 1, 27};
//         int[] result = island.solution(maps);
//        Assertions.assertThat(answer).isEqualTo(result);
    }
}
