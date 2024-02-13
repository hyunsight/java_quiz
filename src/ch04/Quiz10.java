package ch04;

import java.util.Scanner;

public class Quiz10 {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);

        int bankAccount = 0;

        while (true) {
            System.out.print("선택: ");
            String inputOption = scanner.nextLine();

            if(inputOption.equals("1")) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("예금액: ");
                String cash1 = scanner1.nextLine();
                bankAccount = bankAccount + Integer.parseInt(cash1);

            } else if(inputOption.equals("2")) {
                Scanner scanner2 = new Scanner(System.in);
                System.out.print("출금액: ");
                String cash2 = scanner2.nextLine();
                bankAccount = bankAccount - Integer.parseInt(cash2);

            } else if(inputOption.equals("3")) {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("잔고: " + bankAccount + "\n");

            } else if (inputOption.equals("4")) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
