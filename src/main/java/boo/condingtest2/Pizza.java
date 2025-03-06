package boo.condingtest2;

public class Pizza {
    public int solution(int n) {
        double answer = 0;
        final int NANO = 7;
        answer = Math.ceil((double) n / NANO);
        return (int) answer;
    }
}
