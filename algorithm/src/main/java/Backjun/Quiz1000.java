package Backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Quiz1000 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum;

        String a = br.readLine();
        String b = br.readLine();

        sum = Integer.parseInt(a) + Integer.parseInt(b);


        System.out.println(sum);
        br.close();


    }
}
