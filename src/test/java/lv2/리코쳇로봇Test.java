package lv2;

import org.assertj.core.api.Assertions;
import org.example.lv2.리코쳇로봇;
import org.junit.jupiter.api.Test;

public class 리코쳇로봇Test {
    리코쳇로봇 robo = new 리코쳇로봇();

    @Test
    void solution() {
    String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
    int answer = 7;
    int result = robo.solution(board);
    Assertions.assertThat(answer).isEqualTo(result);
    }
}
