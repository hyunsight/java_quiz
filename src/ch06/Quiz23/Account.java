package ch06.Quiz23;

import java.util.Scanner;

public class Account {
    String accountSn;
    String accountName;
    String balance;
    String[] account = {accountSn, accountName, balance};

    Account (String accountSn, String accountName, String balance) {
        this.accountSn = accountSn;
        this.accountName = accountName;
        this.balance = balance;
      }

    public Account() {

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("--------------------");

        System.out.print("선택: ");
        String strNum = scanner.nextLine();

        if (strNum.equals("1")) {
            System.out.println("----------");
            System.out.println("계좌생성");
            System.out.println("----------");

            System.out.print("계좌번호: ");
            String accountSn = scanner.nextLine();
            System.out.print("계좌주: ");
            String accountName = scanner.nextLine();
            System.out.print("초기입금액: ");
            String balance = scanner.nextLine();
            System.out.println("계좌가 생성되었습니다.");
        }
    }
}
