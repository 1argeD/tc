package org.example.GreedyAlorithm;
/*어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 합니다.
단, 두 번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있습니다.
N에서 1을 뺍니다.
N을 K로 나눕니다.
예를 들어 N이 17, K가 4라고 가정합시다. 이때 1번의 과정을 한 번 수행하면 N은 16이 됩니다.
이후에 2번의 과정을 두 번 수행하면 N은 1이 됩니다. 결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 됩니다.
이는 N을 1로 만드는 최소 횟수입니다.
N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성하세요.*/
public class 일이될때까지 {
    public static int solution(int n, int k) {
        int answer= 0;
        while(true) {
            if(n==1) {
                break;
            } else if(n%k==0) {
                n /= k;
                answer++;
            } else {
                n -= 1;
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        int n = 25;
        int k =5;
        int answer = 2;
        int result = solution(n, k);
        if(answer == result) {
            System.out.print("이 수식의 답은"+result+"입니다");
            System.out.print(true);
        } else {
            System.out.print("이 수식의 답은"+result+"입니다");
            System.out.print(false);
        }
    }
    }
