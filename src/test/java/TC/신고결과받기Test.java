package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.신고결과받기;
import org.junit.jupiter.api.Test;

public class 신고결과받기Test {
    private final 신고결과받기 reporting = new 신고결과받기();

    @Test
    void 신고결과받기() {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = reporting.solution(id_list, report, k);
        int[] answer = {2,1,1,0};
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
