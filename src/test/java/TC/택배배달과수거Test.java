package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.택배배달과수거;
import org.junit.jupiter.api.Test;

public class 택배배달과수거Test {
    private final 택배배달과수거 drive = new 택배배달과수거();

    @Test
    void solution(){
        int cap = 4;
        int n = 5;
        int[] deliveries = {1,0,3,1,2};
        int[] pickups = {0, 3, 0, 4, 0};
        long answer = 16;
        long result = drive.solution(cap, n, deliveries, pickups);

        Assertions.assertThat(answer).isEqualTo(result);
    }
}
