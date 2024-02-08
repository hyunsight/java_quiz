package ch03;

public class Quiz2 {
    public static void main(String[] args) {
        int score = 85;
        String result = (!(score>90))?"가":"나"; //가 - 90 초과가 아닌 경우, '가'이므로
        System.out.println(result); //가
    }
}
