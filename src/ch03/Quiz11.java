package ch03;

public class Quiz11 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int c = a + b;
        // 정답 내역(참조): (byte)(a + b); -> byte까지 연산시에 int형이 되므로 강제타입 변환

        char ch = 'A';
        ch += (char) 2;

        float f = (float) 3 / 2; // 정답 내역(참조): float f = 3 / 2.0f; -> 정수 연산의 결과는 정수
        long l = (long) 3000 * 3000 * 3000;  // 정답 내역(참조): long l = 3000 * 3000 * 3000L; /

        float f2 = 0.1f;
        double d = (float) 0.1;
        boolean result = d==f2;

        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}
