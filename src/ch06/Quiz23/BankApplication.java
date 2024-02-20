package ch06.Quiz23;

import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("--------------------");

        System.out.print("선택: ");
        String strNum = scanner.nextLine();

        if (strNum.equals("2")) {
            System.out.println("----------");
            System.out.println("계좌목록");
            System.out.println("----------");

            System.out.print("계좌번호: ");
            String accountSn = scanner.nextLine();
            System.out.print("계좌주: ");
            String accountName = scanner.nextLine();
            System.out.print("초기입금액: ");
            int balance = Integer.parseInt(scanner.nextLine());
        }
    }
}
