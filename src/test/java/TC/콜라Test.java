package TC;

import org.assertj.core.api.Assertions;
import org.example.TC.콜라;
import org.junit.jupiter.api.Test;

public class 콜라Test {
    private final 콜라 cola = new 콜라();
    @Test
    void solution() {
        int a= 2;
        int b =1;
        int n=20;
        int answer = 19;
        int result = cola.solution(a,b, n);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
