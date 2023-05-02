package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.양궁;
import org.junit.jupiter.api.Test;

public class 양궁Test {
    양궁 target = new 양궁();

    @Test
    void solution() {
        int n = 1;
        int[] info = {1,0,0,0,0,0,0,0,0,0,0};
        int[] answer = {-1};
        int[] result = target.solution(n,info);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
