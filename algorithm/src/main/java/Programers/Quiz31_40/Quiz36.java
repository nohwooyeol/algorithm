package Programers.Quiz31_40;

import java.util.HashMap;
import java.util.HashSet;

public class Quiz36 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>(); // HashSet은 중복을 없애는 컬렉션
        for (Integer a : nums) { // a에 nums의 값을 초기화
            hashSet.add(a); //hash에 담기는데 이때 a의 중복값은 배재
        }
        if(hashSet.size()>=nums.length/2){ // 중복된 값을 뺀 헤쉬의 길이가 넘어온배열의길이를 나누기 2한 것보다 크면 트루
                                            //제한조건이 num/2
            answer = nums.length/2;        //중복된 값을 빼면 그수안에서 수를 정하면 되니 길이나누기2의 값이 최대값이 된다.
        }else {
            answer = hashSet.size(); // 중복된값을뺀 해쉬의 길이가 더 길면 그만큼이 최대값
        }
        return answer; //답
    }

    public static void main(String[] args) {
        int[] dap = {3,3,3,2,2,2};
        int answer;
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer a : dap) {
            hashSet.add(a);
        }
        System.out.println(hashSet);
        if(hashSet.size()>=dap.length/2){
            answer = dap.length/2;
        }else {
            answer = hashSet.size();
        }
        System.out.println(answer);
    }
}
