package Programers.Quiz41_50;

public class Quiz41 {

    public String solution(int n) {
        String answer = "";
        String[] na = {"1","2","4"};
        switch (n){
            case 1: return answer = "1";
            case 2: return answer = "2";
            case 3: return answer ="4";
        }

        return answer;
    }


    public static void main(String[] args) {
        String answer = "";
        int n=3;
        String[] na = {"1","2","4"};
        switch (n){
            case 1: answer = "1";
            case 2: answer = "2";
            case 3: answer ="4";
        }
        System.out.println(answer);



    }
}
