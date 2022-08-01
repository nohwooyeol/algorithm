package Prac;

public class greedy {

    public static void main(String[] args) {
        int n = 5670;
        int count = 0;

        int money_type[] = {1000, 500, 100, 50, 10};

        for(int money:money_type) {
            count += n / money;
            n %= money;
        }

        System.out.println(count);
    }
}
