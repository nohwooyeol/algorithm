package Programers.Quiz31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/12936
public class Quiz40 {

    public int[] solution(int n, long k) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int n =3;
        int s = 5;
        int[] dap = new int[n]; //숫자의 번호만큼 배열 생성
        List<Integer> list = new ArrayList<>();

        int count=1; //배열에 값을 넣어줌
        for(int i=0;i<dap.length;i++){
            list.add(count);
            count++;
        } //1,2,3
        s--; //하나의 값은 나왔음

        //숫자 3개일떄 6개 2배
        //숫자 4개일때 24개 6배

        for(int i=0;i<s;i++){

        }



    }
}
