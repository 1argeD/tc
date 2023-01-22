package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.택배배달과수거하기;
import org.junit.jupiter.api.Test;

public class 택배배달과수거하기Test {
    private final 택배배달과수거하기 deliversAndPickup = new 택배배달과수거하기();

    @Test
    void solution() {
        int cap = 4;
        int n =5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};
        long answer = 16;
        long result = deliversAndPickup.solution(cap, n, deliveries,pickups);
        Assertions.assertThat(result).isEqualTo(answer);
    }

    @Test
    void case2() {
        int cap = 2;
        int n = 7;
        int[] deliveries ={1, 0, 2, 0, 1, 0, 2};
        int[] pickups={0, 2, 0, 1, 0, 2, 0};
        long answer = 30;
        long result = deliversAndPickup.solution(cap, n, deliveries, pickups);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
