package ch12.quiz6;

import java.util.StringTokenizer;

public class Quiz6 {
    public static void main(String[] args) {
        String str = "아이디, 이름, 패스워드";
        StringTokenizer str2 = new StringTokenizer(str);
        while (str2.hasMoreTokens()) {
            String token = str2.nextToken();
            System.out.println(token);
        }
    }
}
