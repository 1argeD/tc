package org.example.TC;

public class 가운데값반환하기 {
    public String solution(String s) {
        if(s.length() % 2==1) {
            return Character.toString(s.charAt(s.length() / 2));
        } else {
            return s.substring(s.length()/2-1, s.length()/2+1);
        }
        }
    }
