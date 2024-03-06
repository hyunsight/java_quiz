package ch12.quiz3;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //멤버(객체) 계속 추가해도 오버라이딩 통해 자동 출력 가능
    @Override
    public String toString() {
        return id + ": " + name;
    }
}
