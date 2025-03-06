package boo.condingtest2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySimilarity {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Set<String> set = new HashSet<>(Arrays.asList(s2));
        for (String s : s1) {
            if (set.contains(s)) {
                answer++;
            }
        }
        return answer;
    }

}
