package org.example.lv2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*https://school.programmers.co.kr/learn/courses/30/lessons/138476*/
public class 귤고르기 {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerineCountMap = new HashMap<>();

        for (int nowTangerine : tangerine) {
            Integer count = tangerineCountMap.getOrDefault(nowTangerine, 0) + 1;
            /*getOrDefeat(key, V defaultValue)
            key - 값을 가져와야 하는 요소, defaultValue 지정된 키로 매핑된 값이 없을 경우 반환되어야 하는 기본값을 설정함 */
            tangerineCountMap.put(nowTangerine, count);
        }
        /*entrySet() 메서드는 key 와 value 의 값 모두 출력
        keySet() 메서드는 key 의 값만 출력
        Iterator 는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법
        sorted() 정렬시키기 */
        List<Map.Entry<Integer, Integer>> collect = tangerineCountMap
                .entrySet()
                .stream()
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .collect(Collectors.toList());

        int type = 0;
        int count = 0;
        for (Map.Entry<Integer, Integer> each : collect) {
            count += each.getValue();
            type++;
            if (count >= k) {
                return type;
            }
        }

        return type;
    }
}
