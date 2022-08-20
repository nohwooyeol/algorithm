package Programers.Quiz31_40;

//https://school.programmers.co.kr/learn/courses/30/lessons/42840


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quiz37 {
    public int[] solution(int[] answers) {

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};

        int[] count = {0,0,0};

        for(int i=0;i<answers.length;i++){
            if(answers[i] == num1[i]) count[0]++;
            if(answers[i]==num2[i]) count[1]++;
            if(answers[i]==num3[i]) count[2]++;
        }

        int max=0;
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<count.length;i++){
            if(count[i]>max) max = count[i];
        }

        if(max == count[0]) list.add(1);
        if(max == count[1]) list.add(2);
        if(max == count[2]) list.add(3);

        int[] answer = new int[count.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {1,3,2,4,2};
        Quiz37 quiz37 = new Quiz37();
        System.out.println(Arrays.toString(quiz37.solution(answer)));
//
//
//        int[] num1 = {1,2,3,4,5};
//        int[] num2 = {2,1,2,3,2,4,2,5};
//        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
//
////        int count1 =0;
////        int count2 =0;
////        int count3 =0;
//
//        int[] count = {0,0,0};
//
//        for(int i=0;i<answer.length;i++){
//            if(answer[i] == num1[i]) count[0]++;
//            if(answer[i]==num2[i]) count[1]++;
//            if(answer[i]==num3[i]) count[2]++;
//        }
//
//        int max=0;
//        List<Integer> list = new ArrayList<>();
//        for (int i=0;i<count.length;i++){
//            if(count[i]>max) max = count[i];
//        }
//
//        if(max == count[0]) list.add(1);
//        if(max == count[1]) list.add(2);
//        if(max == count[2]) list.add(3);
//
//        int[] dap = new int[count.length];
//        for(int i=0;i<dap.length;i++){
//            dap[i] = list.get(i);
//        }




        }




    }

