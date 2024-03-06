package ch12.quiz9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz9 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        System.out.println(sdf.format(today));
    }
}
