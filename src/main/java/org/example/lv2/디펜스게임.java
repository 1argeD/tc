package org.example.lv2;

import java.util.Comparator;
import java.util.PriorityQueue;

/*https://school.programmers.co.kr/learn/courses/30/lessons/142085?language=java*/
public class 디펜스게임 {
    public int solution(int n, int k, int[] enemy ) {
        int answer = 0;
/*PriorityQueue란 데이터에 우선순위를 먼저 결정하고 우선 순위가 높은 데이터가 먼저 나가게한다
* PriorityQueue를 사용하기 위해서는 저장할 객체는 필수적으로 Comparable Interface를 먼저 구현해야한다.
* */
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Comparator.reverseOrder());/*높은 숫자가 우선 수위인 int 형을 우선 순위로*/

        int sum = 0;
        /*적 병사의 총합은 sum으로 합산하고, i번 쨰의 적을 배열에 저장함*/
        for(int i=0; i<enemy.length; i++) {
            sum += enemy[i];
            q.add(enemy[i]);
            /*가지고 있는 병사의 숫자가 더 적고 무적권을 0번 가지고 있을 경우 적의 수를 반환하고 i번쨰 라운드가 정답*/
            if (sum>n){
                if(k==0) {
                    q.poll(); /*Queue에서 자료 빼기 반대로 넣을 때는 offer()를 사용*/
                    answer = i;
                    break;
                }
/*length 는 배열, length()는 문자열(String Object)일 때 사용. 배열과 문자열은 immutable(변경불가)한 특징을 갖는데,
*String, boolean, Integer,Float, Long 등등이  생성 후 변경 불가능한 Immutable Object이다.
*반대의 경우 size()를 사용한다. (컬렉션 프레임워크 List ,Map ,Set의 인터페이스 등)*/

                /*해당 라운드는 무적권을 사용했으므로
                무적권을 하나 뺴고,
                 배열 q에서 이번 라운드의 적 숫자를 반환시켜 temp 으로 설정한다.
                 그리고 temp 을 sum 의 값에 포함하지 않도록 차감한다.
                 */
                if(q.size()>0){
                    int temp = q.poll();
                    k=k-1;
                    sum -= temp;
                }

            }
/*만약 해당 라운드의 숫자가 enemy 의 마지막 번째와 같다면 라운드를 모두 클리어 했으므로
answer 는 enemy 의 길이와 같다.*/
            if(i == (enemy.length-1))
                answer = enemy.length;
        }

        return answer;
            }
        }
