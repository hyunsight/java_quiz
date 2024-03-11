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

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String, Integer> entry : entrySet) {
            if(entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }
        System.out.println("평균점수: " + totalScore / map.size());
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고 점수를 받은 아이디: " + name);
     }
}

