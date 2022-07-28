package Practice;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class bufferedwriter {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언!
        String s = "abcdefg"; //String 값
        bw.write(s+"\n"); //bw buffer에 값을 저장 println처럼 띄어쓰기 기능이 없어서 "/n"사용으로 띄어쓰기
        bw.flush(); // bw buffer에 있는값을 한번에 출력
        bw.close(); // bw buffer를 꼭 닫아주도록하자!


    }
}
