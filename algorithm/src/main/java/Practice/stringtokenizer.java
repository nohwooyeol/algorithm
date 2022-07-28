package Practice;

import java.util.StringTokenizer;

public class stringtokenizer {

    public static void main(String[] args) {
        //stringtokenizer는 문자열을 나누는 클래스
        //문자열을 토큰화하여 분리하는 클래스
        //default는 띄어쓰기로 분리
        //nextToken으로 토큰을 하나씩 꺼내서 보여줌
        // 안에 있는 token을 다쓰면 에러발생

        String str = "안녕 나는 노우열 이라고해!";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.nextToken()); //안녕
        System.out.println(st.nextToken()); //나는
        System.out.println(st.nextToken()); // 노우열
        System.out.println(st.hasMoreTokens()); // token 값이 있으니 true;
        System.out.println(st.nextToken()); // 이라고해!
        System.out.println(st.hasMoreTokens()); // token 값이 없으니 false;






    }
}
