package org.example.TC;

import javax.xml.soap.SAAJResult;
import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Double.*;

public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] target = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String[] skills = {"*","#"};
        ArrayList<String> dart = new ArrayList<>();
        StringBuffer word = new StringBuffer();

        for(int i = 0; i<dartResult.length(); i++) {
            dart.add(Arrays.toString(dartResult.split("")));
            if(dart.get(i).equals("0")) {
                dart.get(i).replace("0","10");
            }
            if(dart.get(i).equals("S")) {
                int s = (int) Math.pow(parseDouble(dart.get(i-1)), 1);
            } else if(dart.get(i).equals("D")) {
                int d = (int) Math.pow(parseDouble(dart.get(i-1)), 2);
            } else if(dart.get(i).equals("T")) {
                int t = (int) Math.pow(parseDouble(dart.get(i-1)), 3);
            }
            for(int k =0 ; k<skills.length; k++) {
                if(dart.get(i).equals(skills[k])) {
                    if(skills.equals("#")) {

                    }
                }
            }
        }

        return answer;
    }
}
// drat = {1,S,2,D,*,3,T}
