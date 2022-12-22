package org.example.TC;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120894?language=java*/
public class 영어가싫어요 {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers.replace("one", "1")
                            .replace("two","2")
                            .replace("three","3")
                            .replace("four","4")
                            .replace("five","5")
                            .replace("six","6")
                            .replace("seven","7")
                            .replace("eight","8")
                            .replace("nine","9")
                            .replace("zero","0")
        );


    }

    public long solution2(String numbers) {
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<num.length;i++) {
          if(numbers.contains(num[i])) {
              numbers = numbers.replaceAll(num[i], String.valueOf(i));
          }
        }
        return Long.parseLong(numbers);
    }
}
