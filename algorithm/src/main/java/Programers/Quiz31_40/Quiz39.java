package Programers.Quiz31_40;

import java.util.ArrayList;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class Quiz39 {

        public int[] solution(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int  i =0; i<arr.length ; i++){
                if(i==0){ //인덱스 0의 값을 리스트에 넣는다.
                    list.add(arr[i]);
                }else{
                    if(arr[i]!=arr[i-1]){//arr[i]의 값과 arr[i-1]의 값이 같지않으면
                        list.add(arr[i]); //리스트추가
                    }
                }
            }
            int[] answer = new int[list.size()];
            for(int i=0;i<list.size();i++){
                answer[i] = list.get(i);
            }
            return answer;
        }



    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Quiz39 quiz39 = new Quiz39();


//        ArrayList<Integer> list = new ArrayList<>();
//        for(int  i =0; i<arr.length ; i++){
//            if(i==0){
//                list.add(arr[i]);
//            }else{
//                if(arr[i]!=arr[i-1]){
//                    list.add(arr[i]);
//                }
//            }
//        }
//        System.out.println(list);

    }

}
