package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.혼자놀기의달인;
import org.junit.jupiter.api.Test;

import javax.print.attribute.standard.PrinterURI;

public class 혼자놀기의달인Test {
    private final 혼자놀기의달인 solo = new 혼자놀기의달인();

    @Test
    void solution() {
        int[] cards = {8,6,3,7,2,5,1,4};
        int answer = 12;
        int result = solo.solution(cards);
        Assertions.assertThat(answer).isEqualTo(result);
    }
}
