package Backjun;

public class Quiz2839 {

    public static void main(String[] args) {
        int n = 18;
        int[] z = {3,5};
        int count = 0;
        for (int i : z) {
            count += n / i;
            n %= i;
        }
        System.out.println(count);
    }
}
