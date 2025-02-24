package boo.condingtest2;

import java.util.Arrays;
import java.util.Collections;

public class MakeMaxSUM {
    public int solution(int[] numbers) {
        //Todo 방법1 배열을 큰순서대로 정렬후 맨앞에 있는 두수를 곱하기
        int [] sortedNumbers = Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        return sortedNumbers[0] * sortedNumbers[1];
    }
}
