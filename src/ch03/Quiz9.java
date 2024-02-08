package ch03;

public class Quiz9 {
    public static void main(String[] args) {
        int num = 1;
        String result = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0");
        System.out.println(result);
    }
}
