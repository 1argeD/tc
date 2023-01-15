package org.example.GreedyAlorithm;

import java.util.*;
import java.util.stream.IntStream;


/*한 마을에 모험가가 N명 있습니다.
모험가 길드에서는 N명의 모험가를 대상으로 '공포도'를 측정했는데,
'공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어집니다.
모헌가 길드장인 길동이는 모험가 그룹을 안전하게 구성하고자
공포도가 X인 모험가는 반드시 X명 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정했습니다.
길동이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금합니다.
N명의 모험가에 대한 정보가 주어졌을 때, 여행을 떠날 수 있는 그룹의 수의 최댓값을 구하는 프로그램을 작성하세요.
예를 들어 N=5이고, 각 모험가의 공포도가 다음과 같다고 가정합시다.
2 3 1 2 2
이 경우 그룹 1에 공포도가 1, 2, 3인 모험가를 한 명씩 넣고,
그룹 2에 공포도가 2인 남은 두명을 넣게 되면 총 2개의 그룹을 만들 수 있습니다.
또한 몇 명의 모험가는 마을에 그대로 남아 있어도 되기 때문에, 모든 모험가를 특정한 그룹에 넣을 필요는 없습니다.*/

public class 모험가길드 {
    public static int solution(int[] n) {
        Stack<Integer> people = new Stack<>();
        Stack<Integer> team = new Stack<>();
        int answer = 0;
        for (int k : n) {
            people.add(k);
            Arrays.sort(n);
            int x = n[n.length - 1];
            if (k == x) {
                team.add(n[n.length - 1]);
                for (int j = 0; j < x-1; j++) {
                    team.add(n[j]);
                    Integer[] h = IntStream.range(0,n.length-1)
                            .filter(idx -> idx != team.peek())
                            .mapToObj(idx -> n[idx])
                            .toArray(Integer[] :: new);
                    answer++;
                }
            }
        }
        System.out.print(team);
        return answer;
    }

    public static void main(String[] args ) {
        int[] n = {2,2,1,2,2};
        int x = 3;
        int answer = 2;
        int result = solution(n);
        System.out.print(result==answer);
        System.out.print(result);
    }
}
