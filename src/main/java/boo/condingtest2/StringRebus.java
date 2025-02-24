package boo.condingtest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringRebus {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        int [] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
