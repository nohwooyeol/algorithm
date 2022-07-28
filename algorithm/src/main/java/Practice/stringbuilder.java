package Practice;

public class stringbuilder {

    public static void main(String[] args) {
        //String은 불면객체라고 한다.
        //String객체와 String 객체를 더하는 행위는 메모리 할당과 메모리헤제를 발생시키며
        // 더하는 연산이 많아진다면 성능이 안좋아짐!
        String sung = "noh";
        String name = "woo";
        System.out.println(sung+name);

        //String 객체와 다르게 기존데이터에서 append를 사용하여 늘리기때문에
        //속도도 빠르고 상대적으로 부화가 적다!
        StringBuilder sb = new StringBuilder();
        sb.append("노"); //문자열 추가
        sb.append("우");//문자열추가
        System.out.println(sb.toString()); // 문자열 출력
        System.out.println(sb.length()); //문자열 길이


        //Stringbuffer는 Stringbulider와 같은 방식으로 사용되지만
        // Stringbuilder보다 메모리량도 많고 속도도 느리다
        // 하지만 멀티스레드 환경에서는 추천한다!
        StringBuffer sb1 = new StringBuffer(); //선언
        sb1.append("임"); //문자추가
        sb1.append("주"); // 문자추가
        System.out.println(sb1.toString()); //문자열 출력



    }
}
