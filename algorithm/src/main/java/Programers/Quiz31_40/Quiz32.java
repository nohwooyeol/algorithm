package Programers.Quiz31_40;


import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Quiz32 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length; //전체 인원에서 잃어버린인원 빼기 뺴면 체육복이 1개있는학생
        Arrays.sort(lost); //배열을 정렬
        Arrays.sort(reserve); // 배열을 정렬

        for(int i=0;i<lost.length;i++){  //읽어버린사람 수만큼 반복
            for (int j=0;j<reserve.length;j++){ //여벌옷 있는 사람수 만큼 반복
                if(lost[i] == reserve[j]){ // 여벌옷이 있는데 잃어버린사람 찾는 조건
                answer++; // 체육복이 하나인사람 +1
                    //겹치는 인원은 빼주기!
                }
            }
        }
        System.out.println("체육가능 인원 "+answer);
        for(int i=0;i<lost.length;i++){  //읽어버린사람 수만큼 반복
            for (int j=0;j<reserve.length;j++){ //여벌옷 있는 사람수 만큼 반복
              if(reserve[j] == lost[i]-1 || reserve[j] ==lost[i]+1){ //앞뒤 번호중 둘중하나가 true면 진행
                  answer++; //빌려줄수있는사람
                  //겹치는 사람의
                  break;
              }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Quiz32 quiz32 = new Quiz32();
        System.out.println(quiz32.solution(5,new int[]{2,4},new int[]{3}));
    }
}

