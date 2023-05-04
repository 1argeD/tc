package org.example.lv2;

import java.util.*;

public class 무인도여행 {
  public int[] solution(String[] maps) {
      LinkedList<Integer>island = new LinkedList<>();
      boolean[][] visited = new boolean[maps.length][maps[0].length()];

      for(int i=0; i< maps.length; i++) {
          int sum = 0;
          for(int j=0; j<maps[0].length();j++) {
              sum=search(i,j,visited, maps);
              if(sum>0) island.add(sum);
          }
      }

      Collections.sort(island);
      return island.isEmpty()?new int[]{-1}:island.stream().mapToInt(Integer::intValue).toArray();
  }

  public int search(int i, int j, boolean[][] visited, String[] maps) {
      if(i<0||j<0||i>=visited.length||j>=visited[0].length|| visited[i][j] ||maps[i].charAt(j)=='X') return 0;
      visited[i][j]=true;
      return (maps[i].charAt(j)-'0')
              + search(i-1,j,visited,maps)
              + search(i+1,j,visited,maps)
              + search(i,j-1,visited,maps)
              + search(i,j+1,visited,maps);
  }
}
