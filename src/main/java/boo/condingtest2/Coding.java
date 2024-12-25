package boo.condingtest2;

import java.util.*;

public class Coding {
    public Integer levels(List<Integer> levels) {
        Collections.sort(levels);
        int math = (int) Math.ceil(levels.size() * 0.75) - 1;
        return levels.get(math);
    }
}
//1,2,3,4,5,6,7,8