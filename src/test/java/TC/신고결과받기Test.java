package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.신고결과받기;
import org.junit.jupiter.api.Test;

public class 신고결과받기Test {
    신고결과받기 reportResult = new 신고결과받기();

    @Test
    void solution() {
        String[] id_list = {"con", "ryan"};
        String[] repost = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;
        int[] result = {0,0};
        int[] answer = reportResult.solution(id_list, repost, k);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
