package ch07.Quiz8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();
        /*
        예상 결과:
        System.out.println("스노우 타이어가 굴러갑니다.");
        System.out.println("스노우 타이어가 굴러갑니다."); //오버라이드된 내역이 출력되므로
        */
    }
}
