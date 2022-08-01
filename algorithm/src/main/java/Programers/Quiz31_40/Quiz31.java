package Programers.Quiz31_40;

//
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Quiz31 {

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length]; //넘어온 String배열의 길이 만큼 배열을 생성
        ArrayList<String> list = new ArrayList<>(); //데이터를 담을 Arraylist을 생성
        for(int i =0; i<answer.length;i++){ //넘어오는 String의 배열만큼 for문을 돌린다.
            list.add(strings[i].charAt(n)+strings[i]); //list.add 사용하여 string[i].charAt(n)에 문자를 뽑아서 strings배열에 값에 더한다.
        }
        Collections.sort(list); // Collections 를 사용하여 정렬

        for (int i =0; i<answer.length;i++){ //넘어오는 String의 배열만큼 for문을 돌린다.
            answer[i] = list.get(i).substring(1); // answer[i] 에 list값을 받고 앞에 문자를 subString(1)를 사용해서 담는다.
        }
        return answer;
    }

    public static void main(String[] args) {
        Quiz31 quiz31 = new Quiz31();
        String[] dap = quiz31.solution(new String[]{"sun","bed","car"},1);
        System.out.println(Arrays.toString(dap));

       /* String [] str2 = new String[]{"sun", "bed", "car"};
        ArrayList<String> list = new ArrayList<>();
        int n= 1;
        String[] dap =new String[str2.length];
        for(int i=0;i<str2.length;i++){
            list.add(str2[i].charAt(n)+str2[i]);
        }
        Collections.sort(list);

        for(int i=0;i<dap.length;i++){
            dap[i] = list.get(i).substring(1);
        }
        System.out.println(Arrays.toString(dap));*/







    }
}
