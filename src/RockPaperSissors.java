package aoc2022;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;

public class RockPaperSissors {
    private static long score = 0L;
    private static final Map<String, Long> map = Map.of(
            "A X", 4L,
            "A Y", 8L,
            "A Z", 3L,
            "B X", 1L,
            "B Y", 5L,
            "B Z", 9L,
            "C X", 7L,
            "C Y", 2L,
            "C Z", 6L
    );
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("/Users/victorcruz/projects/AOC2022/aoc/src/input.txt"));
        String line = in.readLine();
        while (line != null) {
            score += map.get(line);
            line = in.readLine();
        }
        System.out.println(score);
    }
}
