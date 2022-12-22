package org.example.TC;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*https://school.programmers.co.kr/learn/courses/30/lessons/120892*/
public class 암호해독 {
    public String solution(String cipher, int code) {
        String answer = "";
        for(int i =code-1; i<cipher.length(); i+=code) {
            /*charAt()이란 String 으로 저장된 문자중에 한 글자만 변환해서 char 타입으로 변환해줌*/
            answer += cipher.charAt(i);
            }
        return answer;
    }

    public String solution2(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(value -> value%code == code-1)
                .mapToObj(e -> String.valueOf(cipher.charAt(e)))
                .collect(Collectors.joining());
    }
}
