package org.example.TC;

import javax.swing.text.MaskFormatter;
import java.awt.event.ItemEvent;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;

public class 푸드파이터 {
    public String solution(int[] food) {
        StringBuilder an = new StringBuilder();
        for(int i =1; i<food.length; i++) {
            for (int j=0; j<food[i]/2; j++) {
                an.append(i);
            }
        }
        String answer = an.toString()+"0"+ an.reverse().toString();
        return answer;
    }
    }
