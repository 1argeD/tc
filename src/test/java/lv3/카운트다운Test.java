package lv3;

import org.assertj.core.api.Assertions;
import org.example.lv3.카운트다운;
import org.junit.Test;

public class 카운트다운Test {
    private 카운트다운 countDown = new 카운트다운();

    @Test
    public void solution() {
        int target = 61;
        int[] answer = {2,1};
        int[] result = countDown.solution(target);
        Assertions.assertThat(result).isEqualTo(answer);
    }
 }
