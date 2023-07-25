package lv3;

import org.assertj.core.api.Assertions;
import org.example.lv3.양과늑대;
import org.junit.Test;

public class 양과늑대Test {
    양과늑대 sheepAndWolf = new 양과늑대();
    @Test
    public void solution() {
        int[] info = {0,0,1,1,1,0,1,0,1,0,1,1};
        int[][] edges = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
        int answer = 5;
        int result = sheepAndWolf.solution(info, edges);
        Assertions.assertThat(result).isEqualTo(answer);
    }
}
