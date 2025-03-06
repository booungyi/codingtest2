package boo.condingtest2;

public class MussecMoreHigh {
    public int solution(int[] arrays, int height) {
        int answer = 0;
        for (int array : arrays) {
            if (height < array) {
                answer++;
            }
        }
        return answer;
    }
}
