package org.example.TC;

public class 택배배달과수거 {
    public long solution(int cap, int n, int[] deliveries, int[] pickups) {
        long answer = -1;
        for(int i=0; i<=n; i++) {
            int lost = cap - deliveries[i];
            int drive = 0;
            if(lost>=cap) {
                int reach = drive + i;
                for(int j=0; j<=n;j++) {
                    int recycle = cap - pickups[j];
                    if(recycle>=cap) {
                        answer = Long.valueOf(reach + j);
                    }
                }
            }
        }
        return answer;
    }
}
