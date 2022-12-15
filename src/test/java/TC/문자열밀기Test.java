package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.문자열밀기;
import org.junit.jupiter.api.Test;

public class 문자열밀기Test {
    private final 문자열밀기 push = new 문자열밀기();

    @Test
    void 문자열을완성할수있을때() {
        String A= "hello";
        String B =  "ohell";
        int result = 1;

        int answer = push.solution(A,B);
        Assertions.assertThat(result).isEqualTo(answer);

    }

    @Test
    void 문자열을완성할수없을때() {
        String A = "apple";
        String B = "elppa";
        int result = -1;

        int answer = push.solution(A,B);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
