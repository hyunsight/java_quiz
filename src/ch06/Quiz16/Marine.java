package ch06.Quiz16;

public class Marine {
    //필드
    int x, y = 0; //Marine의 위치좌표
    int hp = 60; //현재 체력
    // - marine 1~3 공격력, 방어력 공유하고 싶을 때 static 추가
    static int weapon = 6; //공격력
    static int armor = 0; //방어력

    //메소드
    //1. 공격력 증가시키는 메소드
    // - 필드 외 메소드에서도 static을 붙여주는 것이 좋음 (다른 개발자 가독성 위해)
    static void weaponUp() {
        weapon++;
    }
    //2. 방어력 증가시키는 메소드
    static void armorUp() {
        armor++;
    }

    //3. 캐릭터의 위치 움직이는 메소드
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}