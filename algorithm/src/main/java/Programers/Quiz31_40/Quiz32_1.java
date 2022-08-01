package Programers.Quiz31_40;

import java.util.Arrays;

public class Quiz32_1 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(lost));
        System.out.println(Arrays.toString(reserve));
        System.out.println(answer);
        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(reserve));
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        Quiz32_1 quiz32_1 = new Quiz32_1();
        System.out.println(quiz32_1.solution(5,new int[]{2,4},new int[]{3}));

    }
}
