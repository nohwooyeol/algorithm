package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10951_1 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferReaer 클래스 사용
        StringBuilder sb = new StringBuilder(); //Stringbuilder 클래스 사용
        StringTokenizer st;
        String str;

        while( (str=br.readLine()) != null ){ //str = 버퍼로 받은 값! ex) 1 1 이 널이 아니면true 널이면 false

            st = new StringTokenizer(str," "); // Stringtokenizer로 띄어쓰기 제거후 토큰화
            int a = Integer.parseInt(st.nextToken()); // 첫번쨰 토크을 int형으로 형변환
            int b = Integer.parseInt(st.nextToken()); // 두번쨰 토크을 int형으로 형변환
            sb.append(a+b).append("\n"); // String builder에 a+b값 추가후 엔터가 안되기때문에 .apeend("\n")사용으로 줄바꿈

        }
        System.out.print(sb);
    }
}
