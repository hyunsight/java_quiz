package ch06.Quiz20;

public class Example {
    //isNumber 별도로 객체 생성없이 진행할 경우, static 메소드인 점 인지해야 한다.
    static boolean isNumber(String str) {
        //1안 (문자가 하나라도 포함되어있을 때 에러 출력)
        /*
        if (Double.parseDouble(str) >= 0 || Double.parseDouble(str) < 0) {
            return true;
        } else return false;
        */

        //2안
        // - 숫자 문자는 유니코드와 비교할 수 있다.
        // - 자동타입 변환이 일어나면서 유니코드로 비교한다.
        // - 유니코드는 0~9사이의 숫자만 존재한다.
        for (int i = 0; i < str.length(); i++) {
             char num = str.charAt(i);
            if (num < '0' || num > '9') {
                return false;
            }
        } return true; //for문을 무사히 빠져나왔다는건 str값이 모두 숫자
  }

    public static void main(String[] args) {
        String str = "123";
        //같은 클래스 내에서 호출 시, 클래스명 생략 가능
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
