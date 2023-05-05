package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.주식가격;
import org.junit.jupiter.api.Test;

public class 주식가격Test {
    주식가격 stock = new 주식가격();

    @Test
    void solution() {
        int[] prices = {1, 2, 3, 2, 3};
        int[] answer = {4, 3, 1, 1, 0};
        int[] result = stock.solution(prices);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
