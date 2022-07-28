package Backjun;

import java.io.*;

public class Quiz10950 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼를 생성

        int num = Integer.parseInt(br.readLine()); //버퍼값은 String 타입이기떄문에 parseInt로 형변환


        for(int i =0;i<num;i++){ //버퍼로 받은 자리수 만큼  반복
            String[] str = br.readLine().split(" "); // 버퍼로 받은 값의 공백은 제외하고 배열에 담음
            int a = Integer.parseInt(str[0]); //String배열 값 형변환
            int b = Integer.parseInt(str[1]); //String배열 값 형변환
            System.out.println(a+b);
        }


        br.close();
    }
}
