package ch03;

public class Quiz8 {
            public static void main(String[] args) {

                // 정수 연산의 결과는 정수
                int numOfApples = 123; // 사과의 개수
                int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
                int numOfBucket = (numOfApples % sizeOfBucket > 0) ? numOfApples / sizeOfBucket + 1 : numOfApples / sizeOfBucket;
                // 정답 내역(참조): numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
                System.out.println("필요한 바구니의 수 :" + numOfBucket);

    }
}
