package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.요격시스템;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

public class 요격시스템Test {
    요격시스템 system = new 요격시스템();

    @Test
    void solution() {
        int[][] target = {{4,5}, {4,8}, {10,14}, {11,13}, {5,12}, {3,7}, {1,4}};
        int answer = 3;
        int result = system.solution(target);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
