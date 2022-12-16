package org.example.lv2;

import java.util.ArrayList;
import java.util.List;

public class 기사단원의무기 {
        public int solution(int number, int limit, int power) {
            /*Integer은 Int의 레퍼클래스로 int는 기본형 변수로 데이터의 타입에 따라서 저장될 공간과 크기를 정한 것이고
            * Interger 은 1. 매개변수로 객체를 필요할 때 2.기본형이 아닌 객체를 저장할 때 3.객체간의 비교가 필요할 때 사용
            * 기본형을 객체로 다루기 위해서 사용하는 클래스를 레퍼 클래그 라고하며 Double, Float, Long, Short, Byte Character, Boolean 이있다.
            * */
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= number; i++) {
                countDivisor(list, i);
            }


/*stream()중간연산자 mapToInt()
* map메서드는 일반 스트림과 기본형 특화 스트림 모두에서 제공하는 메서드이다.
* Stream,IntStream,LongStream,DoubleStream 등이 있으며 모두 map 메서드를 제공한다..
* 일반 스트림에서 Function<T, R>이 사용되는데 T가 변환전 R이 변환 후 이다.
*
* mapToInt 메서드는 스트림을 IntStream으로 변환해주는 메서드이다.
* IntStream을 제외한 모든 스트림에서 제공한다.
*map 메서드와 다르게 ToIntFunction<? super T> mapper 를 라미터로 전달한다.
*기본 Function<R,T>에서 T 타입만 제네릭으로 받고  R은 int 로 정해져 있다.
* */

/*삼항 연산자 : 조건식 ? 반환식 1: 반환식 2
 * 조건식 앞에 결과값에 따라서 참이라면 반확식1을 반환하고 거짓이면 반환식2를 반환한다
 * */
            /*e의 값이 limit 값보다 같거나 작다면 e를 반환하고 아니라면 power 를 반환한다*/
            return list.stream().mapToInt(e -> e <= limit ? e : power)/*e는 list가 Integer의 리스트 안의 객체이기 때문에 기본형인 int 로 바꿔서 sum()을 통해서 총합을 계산한다.*/
                    .sum();/*기본형 특화 스트림에서만 사용이 가능하며 Stream 의 총합을 구할때 사용한다.*/

        }

        private void countDivisor(List<Integer> list, int number) {
            int count = 0;

            for (int i = 1; i <= Math.sqrt(number); i++) {/*sqrt()제곱근 계산*/
                if (number % i == 0) {
                    count++;
                    if (i != number / i) {
                        count++;
                    }
                }
            }
            list.add(count);
        }
    }
