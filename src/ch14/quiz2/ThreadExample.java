package ch14.quiz2;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <5 ; i++) {
                    System.out.println("글 작성 중");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        thread1.start();

        for (int i = 0; i < 5 ; i++) {
            System.out.println("음악 듣는중");
        }
    }
}

/*
실행 결과 이유
- 스레드의 경우, 기본적으로 병렬 실행되는데, "글 작성 중"의 경우, 2초 동안 잠시 대기 후 실행되므로
  음악 듣는 중 출력이 먼저 실행 후 글 작성 중 출력이 실행된다.
*/