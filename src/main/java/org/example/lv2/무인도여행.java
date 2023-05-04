package org.example.lv2;

import java.util.ArrayDeque;
import java.util.Queue;

public class 무인도여행 {
    class Island {
        int x, y;
        int[] sum;

        public Island(int x, int y, int[] sum) {
            this.x = x;
            this.y = y;
            this.sum = sum;
        }
    }
    public int[] solution(String[] maps) {
        Island land = null;
        int[][] move = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        for (int y = 0; y < maps.length; y++) {
            for (int x = 0; x < maps[0].length(); x++) {
                if (maps[y].charAt(x) != 'X') {
                    int sum = Integer.parseInt(String.valueOf(maps[y].charAt(x)));
                    land = new Island(x, y, new int[] {sum});
                }
            }
        }

        Queue<Island> pointQueue = new ArrayDeque<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        pointQueue.add(land);

        while (!pointQueue.isEmpty()) {
            Island island = pointQueue.poll();
            int x = island.x, y = island.y;
            int[] sum = island.sum;

            if (visited[x][y]) continue;
            visited[x][y] = true;

            if (x == land.x && y == land.y && sum== land.sum) return sum;

            for(int[] position : move) {
                int xPoint = x, yPoint = y;
                int[] sum1 = sum;
                while (0<=xPoint+position[0]&&
                        xPoint+position[0]<maps[0].length() &&
                        0<=yPoint+position[1]&&
                        yPoint+position[1]<maps.length&&
                        maps[xPoint+position[0]].charAt(yPoint+position[1])!='X') {
                    xPoint += position[0];
                    yPoint += position[1];
                    sum1.clone();
                }
                if(!visited[xPoint][yPoint]) pointQueue.add(new Island(xPoint, yPoint, sum1));
            }

        }

        return new int[]{-1};
    }
}
