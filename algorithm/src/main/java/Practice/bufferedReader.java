package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedReader  {

    public static void main(String[] args)  {
        try {
            //BufferedReader 는 Scanner와 유사합니다.
            //하지만 속도측면에서는 훨씬 빠르기 떄문에 사용을 추천한다.
            //Buffered를 사용할때는 에외처리를 해줘야한다!
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
            String s= br.readLine(); // readline은 리턴값이 String임!
            System.out.println(s);
            br.close(); //버퍼를 사용후에는 버퍼를 닫아줘야함!
        }catch (IOException e){

        }



    }
}
