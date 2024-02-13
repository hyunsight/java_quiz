package ch04;

public class Quiz8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            String output = " ";
            for (int j = 0; j < i; j++) {
                output += '*';
            }
            System.out.println(output);
        }
    }
}
