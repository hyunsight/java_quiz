package ch02;

public class Quiz3 {
    public static void main(String[] args) {
        System.out.println("1" + "2");

        //char형 + char형 = int형으로 자동 타입변환이 일어난다.
        //  - byte, char, short, int 어떤게 오든지 4개 중 하나만 오면
        System.out.println('A' + 'B');

        //char형 + int형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('1' + 2);

        //char형 + char형 = int형으로 자동 타입변환이 일어난다.
        System.out.println('1' + '2');

        //String형 + 다른타입 = 항상 문자열
        System.out.println('J' + "ava");
    }
}
