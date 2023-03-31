package TC;

import io.kotest.core.spec.style.AnnotationSpec;
import org.assertj.core.api.Assertions;
import org.example.TC.칠의개수;
import org.junit.jupiter.api.Test;

public class 칠의개수Test {
    private 칠의개수 seven = new 칠의개수();

    @Test
    void solution() {
        int[] arrays = {7, 77, 17};
        int answer = 4;
        int result = seven.solution(arrays);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
