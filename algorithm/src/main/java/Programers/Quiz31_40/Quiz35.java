package Programers.Quiz31_40;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748
public class Quiz35 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; //commands 첫번쨰 배열의 길이만큼 배열 생성
        for(int i=0; i<commands.length; i++){ //command의 1차원 배열의 길이만큼 반복
            ArrayList<Integer> list = new ArrayList<>(); //Arraylist 생성
            int start = commands[i][0]; //시작 인덱스
            int end = commands[i][1]; //끝 인덱스
            int select = commands[i][2]; //선택 인덱스
            //정해진 범위만큼 리스트에 값넣기
            for(int j = start -1; j<=end-1; j++){ //-1은 인덱스값이 0부터 시작해서 
                list.add(array[j]); //선택된 값 list에 추가
            }
            
            Collections.sort(list); // list값 정렬
            answer[i] = list.get(select-1); //answer에 리스트값 저장
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz35 quiz35 = new Quiz35();
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    }
}




