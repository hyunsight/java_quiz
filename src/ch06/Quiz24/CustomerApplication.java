package ch06.Quiz24;

import java.util.Scanner;

public class CustomerApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static Customer[] customerArray = new Customer[50];

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("--------------------");
            System.out.println("1. 고객 등록 | 2. 고객 리스트 확인 | 3. 포인트 사용 | 4. 포인트 적립 | 5. 종료");
            System.out.println("--------------------");

            System.out.print("선택: ");

            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    customerList();
                    break;
                case 3:
                    usePoint();
                    break;
                case 4:
                    addPoint();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    //1. 고객 등록
    private static void addCustomer() {
        System.out.println("----------");
        System.out.println("고객 등록");
        System.out.println("----------");

        System.out.print("고객명: ");
        String name = scanner.next();
        System.out.print("핸드폰번호: ");
        String number = scanner.next();
        System.out.print("집주소: ");
        String address = scanner.next();
        System.out.print("포인트: ");
        int point = scanner.nextInt();

        Customer newCustomer = new Customer(name, number, address, point);

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] == null) {
                customerArray[i] = newCustomer;
                System.out.println("결과: 고객 등록 완료되었습니다.");
                break;
            }
        }
    }

    //2. 고객 리스트 확인
    private static void customerList() {
        System.out.println("----------");
        System.out.println("고객 리스트 확인");
        System.out.println("----------");

        for (int i = 0; i < customerArray.length; i++) {
            Customer customer = customerArray[i];

            if (customer != null) {
                System.out.println(customer.getName() + " " + customer.getNumber() + " " + customer.getPoint());
            } else break;
        }
    }

    //3. 포인트 사용
    private static void usePoint() {
        System.out.println("----------");
        System.out.println("포인트 사용");
        System.out.println("----------");

        System.out.print("핸드폰번호: ");
        String number = scanner.next();

        System.out.print("사용 포인트: ");
        int p = scanner.nextInt();

        Customer customer = findCustomer(number);

        if (customer == null) {
            System.out.println("결과: 등록된 회원이 아닙니다.");
            return;
        } else if (customer.getPoint() < 500) {
            System.out.println("결과: 포인트가 500점 이상일 때 사용 가능합니다.");
        } else {
            customer.setPoint(customer.getPoint() - p);
            System.out.println("결과: 포인트 사용 완료되었습니다.");
        }
    }

    //4. 포인트 적립
    private static void addPoint() {
        System.out.println("----------");
        System.out.println("포인트 적립");
        System.out.println("----------");

        System.out.print("핸드폰번호: ");
        String number = scanner.next();

        System.out.print("적립 포인트: ");
        int p = scanner.nextInt();

        Customer customer = findCustomer(number);

        if (customer == null) {
            System.out.println("결과: 등록된 회원이 아닙니다.");
            return;
        } else if (p >= 2000) {
            customer.setPoint(customer.getPoint() + ( p + p * 10 / 100 ));
            System.out.println("결과: 포인트 적립 완료되었습니다.");
        } else {
            customer.setPoint(customer.getPoint() + p);
            System.out.println("결과: 포인트 적립 완료되었습니다.");
        }
    }

    //5. 핸드폰 번호로 해당 고객 객체 찾기
    private static Customer findCustomer(String number) {
        Customer customer = null;

        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i] != null) {
                String dbNumber = customerArray[i].getNumber();

                if (dbNumber.equals(number)) {
                    customer = customerArray[i];
                    break;
                }
            }
        }
        return customer;
    }
}
