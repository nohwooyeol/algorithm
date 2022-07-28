package Programers.Quiz21_30;
//https://school.programmers.co.kr/learn/courses/30/lessons/12940

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz29 {

    public int[] solution(int n, int m) { //파라미터값을 받아옴
        int max = Math.max(n,m); // Math.max 파라미터값을 비교해서 큰수를 max에 초기화
        int min = Math.min(n,m); // Math.min 파라미터값을 비교해서 큰수를 min에 초기화

        while(min!=0){ // while
            int r= max % min;
            max = min;
            min = r;
        }
        int gcd = n*m/max;
        int[] answer = {max,gcd};
        return answer;
    }

    public static void main(String[] args) {
       Quiz29 quiz29 = new Quiz29();
        System.out.println(Arrays.toString(quiz29.solution(2, 5)));

    }
}
