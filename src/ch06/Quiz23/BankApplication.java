package ch06.Quiz23;

import java.util.Scanner;

public class BankApplication {
    //Scanner 객체를 BankApplication 클래스 안의 필드에 생성
    // - 여러 메소드에서 사용하기 위한 목적
    //private: BankApplication 클래스 안에서만 사용 가능
    //static: static (main) 메소드 안에서 사용 가능
    // - 외부에 있는 scanner를 메소드에 적용하기 위해 static 추가 필요
    // - static을 붙이지 않을 경우 인스턴스 필드로 처리되므로 때문에 정적 메소드로 가져다 쓰는 것 불가

    private static Scanner scanner = new Scanner(System.in);
    private static Account[] accountArray = new Account[100]; //(중요) Account 객체만 저장 가능(100개까지), 클래스(참조) 타입도 배열로 만들 수 있으며, 배열로 만들기 위해 클래스명 뒤 [] 붙이면 됨

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("--------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("--------------------");

            System.out.print("선택: ");

            int selectNo = scanner.nextInt(); //입력받음

            switch (selectNo) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }

    //(중요) static: static이 붙은 main 메소드 안에서 호출하기 위해 붙여줌
    //1. 계좌 생성 메소드
    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("계좌주: ");
        String owner = scanner.next();

        System.out.print("초기입금액: ");
        int balance = scanner.nextInt();

        //입력받은 정보를 이용해 Account 객체 생성
        // - 객체를 생성할 때, 생성자 실행
        // - 생성자 매개변수는 입력받은 정보(값)로 적용됨
        Account newAccount = new Account(ano, owner, balance);

        //테스트용 > newAccount 찍을 때 객체 주소 출력됨 (Account@27bc2616)
        // - 계좌 생성할 때마다 다른 객체 생성됨
        //System.out.println("계좌생성 완료!" + newAccount);

        //accountArray 배열에 Account 객체를 저장하기
        for (int i = 0; i < accountArray.length; i++) {
            //accountArray의 디폴트 값은 null이 들어있다.
            // - 배열 크기 지정한 상태에서 값이 없을 때 null 출력
            //(중요) 계좌 객체를 순서대로 저장하기 위해 null 체크한다.
            // - accountArray[i] == null인 부분에 새로 만들어진 계좌 객체를 추가하기 위해 반드시 체크 (없을 시 에러 발생)
            // - 새로 만들어진 계좌 갹체를 차곡차곡 쌓기 위해 accountArray[i] == null 체크
            if (accountArray[i] == null) {
                accountArray[i] = newAccount;
                System.out.println("결과: 계좌가 생성되었습니다.");
                //(중요) 쓸데 없는 반복은 피한다. newAccount 객체를 배열에 전부 저장하지 않는다.
                // - break 없을 시, 100번 실행됨
                // - 따라서 계좌 생성 시, 바로 for문 빠져나가도록 break 추가
                break;
            }
        }
    }

    //2. 계좌 목록 출력 메소드
    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        for (int i = 0; i < accountArray.length; i++) {
            //Account: 타입 (클래스명으로 작성)
            //account: 변수
            Account account = accountArray[i];

            //accountArray 배열 안에서 객체가 있는 부분만 가져온다.
            // - accountArray에 null이 포함되어 있는 상태 > account(accountArray의 값)가 null이 아닌 것 체크 필요
            if (account != null) {
                System.out.println(account.getAno() + " " + account.getOwner() + " " + account.getBalance());
            } else {
                break; //(중요) 쓸데없는 반복 피하기
            }
        }
    }

    //3. 예금 메소드
    private static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("예금액: ");
        int money = scanner.nextInt();


        //입력받은 계좌번호로 고객계좌 객체 찾기
        Account account = findAccount(ano); //찾은 고객계좌

        //해당 고객 계좌가 없으면 메소드를 종료시킴
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        //'기존에 저장되어 있던 예금액(account.getBalance()) + 새로 입금할 예금액'을 더해서 예금해준다.
        // - money만 쓰면 잔고 금액에 덮어씌워지기만 함
        account.setBalance(account.getBalance() + money);
        System.out.println("결과: 예금이 완료되었습니다.");
    }

    //4. 출금 메소드
    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String ano = scanner.next();

        System.out.print("출금액: ");
        int money = scanner.nextInt();


        //입력받은 계좌번호로 고객계좌 객체 찾기
        Account account = findAccount(ano); //찾은 고객계좌

        //해당 고객 계좌가 없으면 메소드를 종료시킴
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        //'기존에 저장되어 있던 출금액(account.getBalance()) - 출금할 금액'을 빼서 잔고에 추가해준다.
        // - money만 쓰면 잔고 금액에 덮어씌워지기만 함
        account.setBalance(account.getBalance() - money);
        System.out.println("결과: 출금이 완료되었습니다.");
    }

    //5. 계좌번호로 고객 계좌 찾는 메소드
    // - Return 타입으로 Account 작성: Account 객체를 리턴해준다.
    private static Account findAccount(String ano) {
        //account 선언의 경우, for문 밖에 작성 필요
        // - for문 안에 작성할 경우, 반복되면서 계산이 이상하게 됨
        Account account = null;

        //배열에 저장된 객체별 계좌번호를 하나씩 비교해간다.
        for (int i = 0; i < accountArray.length; i++) {

            //(중요) accountArray 배열 안에서 Account 객체가 있는 부분만 가져온다.
            if (accountArray[i] != null) {
                //객체에 저장된 계좌 번호 가져오기
                String dbAno = accountArray[i].getAno();

                //객체에 저장된 계좌번호와 매개변수의 계좌번호가 같으면 해당 객체를 account에 저장
                if (dbAno.equals(ano)) {
                    account = accountArray[i];
                    break; //계좌번호를 찾으면 반복문을 빠져나온다.
                }
            }
        }
        return account; //찾은 계좌 객체를 리턴
    }
}

