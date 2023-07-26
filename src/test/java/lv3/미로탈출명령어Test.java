package lv3;

import org.assertj.core.api.Assertions;
import org.example.lv3.미로탈출명령어;
import org.junit.Test;

public class 미로탈출명령어Test {
    미로탈출명령어 miro = new 미로탈출명령어();

    @Test
    public void solution() {
        int n = 3;
        int m = 4;
        int x = 2;
        int y = 3;
        int r = 3;
        int c = 1;
        int k = 5;
        String answer = "dllrl";
        String result = miro.solution(n,m,x,y,r,c,k);

        Assertions.assertThat(answer).isEqualTo(result);

    }
}
