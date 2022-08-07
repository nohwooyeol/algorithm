package Programers.Quiz31_40;

import java.util.HashMap;
import java.util.HashSet;

public class Quiz36 {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> hashSet = new HashSet<>(); //HashSet은
        for (Integer a : nums) {
            hashSet.add(a);
        }
        if(hashSet.size()>=nums.length/2){
            answer = nums.length/2;
        }else {
            answer = hashSet.size();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] dap = {3,3,3,2,2,2};
        int answer;
        HashSet<Integer> hashSet = new HashSet<>();
        for (Integer a : dap) {
            hashSet.add(a);
        }

        if(hashSet.size()>=dap.length/2){
            answer = dap.length/2;
        }else {
            answer = hashSet.size();
        }
        System.out.println(answer);
    }
}
