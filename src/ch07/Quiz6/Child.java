package ch07.Quiz6;

public class Child extends Parent {
    public int studentNo;

    public Child(String name, int studentNo) { 
        //원인: 부모 클래스의 생성자에 매개변수가 있는 상태에서 super()가 생략되어 발생
        //수정: super() 추가
        super(name); 
        //this.name = name;
        this.studentNo = studentNo;
    }
}
