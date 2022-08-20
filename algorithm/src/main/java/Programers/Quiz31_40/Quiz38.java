package Programers.Quiz31_40;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644

public class Quiz38 {
    public Set<Integer> solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i< numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                int sum = numbers[i] + numbers[j];
                hashSet.add(sum);
            }
        }
        return hashSet;
    }

    public static void main(String[] args) {
        int[] num = {2,1,3,4,1};

        Set<Integer> hashSet = new HashSet<>();
        for(int i=0;i< num.length;i++){
            for (int j=i+1;j<num.length;j++){
                int sum = num[i] + num[j];
                hashSet.add(sum);
            }
        }
        System.out.println(hashSet);
    }
}
