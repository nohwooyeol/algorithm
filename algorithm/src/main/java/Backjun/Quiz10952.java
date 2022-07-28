package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Quiz10952 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //bufferReaer 클래스 사용
        StringBuilder sb = new StringBuilder(); //Stringbuilder 클래스 사용
        StringTokenizer st;


        while(true){ //break문이 있기 때문에 true로 진행

            st = new StringTokenizer(br.readLine()," "); // Stringtokenizer로 띄어쓰기 제거후 토큰화
            int a = Integer.parseInt(st.nextToken()); // 첫번쨰 토크을 int형으로 형변환
            int b = Integer.parseInt(st.nextToken()); // 두번쨰 토크을 int형으로 형변환
            if(a==0&&b==0){ // a의 토큰값과 b의 토큰값이 0이라면
                break; //while 멈춰라
            }
            sb.append(a+b).append("\n"); // String builder에 a+b값 추가후 엔터가 안되기때문에 .apeend("\n")사용으로 줄바꿈

        }
        System.out.print(sb);
        }
    }

