package ch15.quiz9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수

        //여기에 코드를 작성하세요.
        /*
        평균 점수: 91
        최고 점수: 96
        최고 점수를 받은 아이디: blue
         */

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
     }
}

