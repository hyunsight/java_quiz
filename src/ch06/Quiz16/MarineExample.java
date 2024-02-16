package ch06.Quiz16;

public class MarineExample {
    public static void main(String[] args) {
        //필드 및 메소드에 static을 붙여준 후 아래와 같이 클래스명에 바로 메소드 실행 (다른 개발자 가독성 위해)
        // - 인스턴스 아래에 메소드 실행 시, 다른 개발자들이 체크하기 어려울 수 있음
        Marine.armorUp();
        Marine.weaponUp();

        Marine marine1 = new Marine();
        marine1.move(100, 200);
        //marine1 공격력 한번 증가하고 싶을 때
        //marine1.weaponUp();

        //marine1 weaponUp 시, marine2, 3의 공격력도 증가됨 (static으로 공유되므로)
        //marine1.weaponUp();
        //marine1.weaponUp();
        //marine1.armorUp();
        System.out.println("marine1의 공격력: " + marine1.weapon);
        System.out.println("marine1의 방어력: " + marine1.armor);

        Marine marine2 = new Marine();
        marine2.move(100, 200);
        //marine2 공격력 두번 증가하고 싶을 때
        //marine2.weaponUp();
        //marine2.weaponUp();
        System.out.println("marine2의 공격력: " + marine2.weapon);
        System.out.println("marine2의 방어력: " + marine2.armor);

        Marine marine3 = new Marine();
        marine3.move(100, 200);
        //marine3 공격력 세번 증가하고 싶을 때
        //marine3.weaponUp();
        //marine3.weaponUp();
        //marine3.weaponUp();
        System.out.println("marine3의 공격력: " + marine3.weapon);
        System.out.println("marine3의 방어력: " + marine3.armor);
    }
}
