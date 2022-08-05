package Programers.Quiz31_40;
//https://school.programmers.co.kr/learn/courses/30/lessons/12926

public class Quiz34 {
    public String solution(String s, int n) {
        String answer = "";
        char[] ch = s.toCharArray();
        for(char c : ch) {
            if(c == 32) answer += " ";
            else {
                if(c <= 90) {
                    c += n;
                    if(c > 90) c -= 26;
                } else {
                    c += n;
                    if(c > 122) c -= 26;
                }
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Quiz34 quiz34 = new Quiz34();
        System.out.println(quiz34.solution("a B z",4));
       /* String s = "z";
        String answer="";
        int n=1;
        char[] s1 = s.toCharArray();

        for(int i=0;i<s.length();i++){
            if(s1[i] == (char)32){ //공백일때!
                answer += s1[i];
                continue;
            }
            if(s1[i]==(char)90){
                s1[i] = (char)64;
            }
            if(s1[i]==(char)122){
                s1[i] = (char)96;
            }
            s1[i] += n;
            answer += s1[i];
        }
        System.out.println(answer);
    }*/
    }
}
