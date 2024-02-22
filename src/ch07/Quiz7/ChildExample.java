package ch07.Quiz7;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        /*
        예상 결과: 객체 생성 시, 부모 생성자 실행 후 자식 생성자 실행되므로
        public Parent() 실행 >
        System.out.println("Parent(String nation) call");
        System.out.println("Parent() call");
        public Child() 실행 >
        System.out.println("Child(String name) call");
        System.out.println("Child() call");
        */
    }
}
