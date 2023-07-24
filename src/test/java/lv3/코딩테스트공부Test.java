package lv3;

import org.assertj.core.api.Assertions;
import org.example.lv3.코딩테스트공부;
import org.junit.jupiter.api.Test;

public class 코딩테스트공부Test {
    private 코딩테스트공부 coding = new 코딩테스트공부();

    @Test
    void solution() {
        int alp = 10;
        int cop = 10;
        int[][] problems = {{10,15,2,1,2}, {20,20,3,3,4}};
        int result = coding.solution(alp, cop, problems);
        int answer = 15;
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
