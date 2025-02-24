import java.util.Arrays;

public class Numbers {
    public double solution(int [] numbers) {
        double answer = 0;
        answer += Arrays.stream(numbers).sum();
        return answer/numbers.length;
    }
}
