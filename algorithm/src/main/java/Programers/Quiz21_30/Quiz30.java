package Programers.Quiz21_30;

import java.util.ArrayList;
import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12926
public class Quiz30 {
    public String solution(String s, int n) {
        String answer = "";
        char[] c = s.toCharArray();
        for (int i=0;i<c.length;i++){
            if((int)c[i]==32){
                answer += c[i];
                continue;
            }
            if((int)c[i]==122){
                c[i] = 96;
            }
            if((int)c[i]==90){
                c[i] = 64;
            }

            c[i] += (char) n;
            answer += c[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        /*String s = "a B z";
        int n =4;
        char[] c = s.toCharArray();
        for(int i=0;i<c.length;i++){
            if((int)c[i]==32){
                continue;
            }
            if((int)c[i]==122){
                c[i] = 96;
            }
            c[i] += (char) n;
        }
        System.out.println(c);*/
        String s = "a B z";
        int n =4;
        char c;
        String dap="";
        for(int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==' '){
                dap += c;
            }
            if (c>='a'&&c<='z'){
                dap += (char)(c+n);
            }else if (c>='A'&&c<='Z'){
                dap += (char)(c+n);
            }

        }
        System.out.println(dap);










    }
}