package ch12.quiz7;

public class IntergerCompareExample {
    public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println(obj1 == obj2);
        System.out.println(obj3.equals(obj4));

        /*
        '=='으로 비교할 경우, 객체 주소를 비교하나, 
        다만 -128 ~ 127 사이의 숫자는 값 자체를 비교함
        따라서 'obj1 == obj2'의 결과값은 true로 출력되나, 'obj3 == obj4'의 결과값은 false로 출력됨
        */
    }
}
