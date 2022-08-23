package Programers.Quiz41_50;

import java.util.ArrayList;

public class Quiz42 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<int> list = new ArrayList<>();
        list.add(0L);
        list.add(1L);

        for(int i = 2 ; i<=n;i++){
            list.add((list.get(i-1)+list.get(i-2))%1234567);
        }
        return answer = list.get(n) ;
    }

    public static void main(String[] args) {
        int n = 1;
        int[] num = new int[n+1];
        num[0]=0;
        num[1]=1;

        for(int i = 2 ; i<=n;i++){
            num[i] = num[i-1]+num[i-2];
        }

        System.out.println(num[n]);
    }
}
