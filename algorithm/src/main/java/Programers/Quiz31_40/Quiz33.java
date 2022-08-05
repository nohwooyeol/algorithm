package Programers.Quiz31_40;

//https://school.programmers.co.kr/learn/courses/30/lessons/12921
public class Quiz33 {
    public int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=i;i++){
                if(i%j==0){
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Quiz33 quiz33 = new Quiz33();
        System.out.println(quiz33.solution(5));



    }
}
