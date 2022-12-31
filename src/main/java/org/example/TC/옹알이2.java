package org.example.TC;


/*https://school.programmers.co.kr/learn/courses/30/lessons/133499*/
public class 옹알이2 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < babbling.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (!babbling[i].contains("yeye") || !babbling[i].contains("woowoo") || !babbling[i].contains("mama") || !babbling[i].contains("ayaaya")) {
                    babbling[i] = babbling[i].replace(words[j], "+");
                    if (babbling[i].replace("+", "").equalsIgnoreCase("")) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }

        public int solution2(String[] babbling) {
            int answer = 0;
            String prev="";
            String str="";
            for(int i=0; i<babbling.length;i++) {
                for(int j=0; j<babbling[i].length();j++) {
                    str+=babbling[i].charAt(j);
                    if(!(prev.equals(str)) && (str.equals("aya") || str.equals("ye") || str.equals("woo") || str.equals("ma"))) {
                        prev=str;
                        str="";
                    }
                }

                if(str.equals("")) {
                    answer++;
                }
                prev="";
                str="";
            }
            return answer;
        }
}
