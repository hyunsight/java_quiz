package ch14.quiz4;

public class ThreadExample {
    public static void main(String[] args) {
        VideoPlay thread1 = new VideoPlay();
        thread1.start();

        MusicPlay thread2 = new MusicPlay();
        thread2.start();
    }
}
