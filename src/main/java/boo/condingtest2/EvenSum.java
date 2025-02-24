package boo.condingtest2;

public class EvenSum {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += (i % 2) == 0 ?  i  : 0;
        }
        return answer;
    }

    public int solution2(int slice, int n) {
        double answer = 0;
        answer = Math.ceil((double) n / slice);
        return (int)answer;
    }

    public int solution3(String str1, String str2) {
        int answer = 0;
        answer = str1.contains(str2) ? 1 : 0;
        return answer;
    }
}
