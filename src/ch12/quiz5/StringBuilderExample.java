package ch12.quiz5;

public class StringBuilderExample {
    public static void main(String[] args) {
        //String str = "";
        StringBuilder str = new StringBuilder();

        for (int i = 1; i <= 100 ; i++) {
            str.append(i);
        }

        System.out.println(str.toString());
    }

}
