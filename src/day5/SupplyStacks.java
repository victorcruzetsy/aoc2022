package aoc2022.day5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;
public class SupplyStacks {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader("/Users/victorcruz/projects/AOC2022/aoc/aoc2022/src/day5/input.txt"));
        String line = in.readLine();
        Stack<String> queue = new Stack<>();
        while (!Character.isDigit(line.charAt(0))) {
            queue.add(line);
            line = in.readLine();
        }
        String[] noStacks = line.split(" ");
        Stack[] stacks = new Stack[Integer.parseInt(noStacks[noStacks.length - 1])];
        initStacks(stacks, queue);
        line = in.readLine();
        while (line != null) {
            int move = getNumber(5, line);
            int from = getNumber(line.lastIndexOf("from") + 5, line) - 1;
            int to = getNumber(line.indexOf("to") + 3, line) - 1;

            for (int i = 0; i < move; i++) {
                if (stacks[from].isEmpty())
                    break;
                stacks[to].add(stacks[from].pop());
            }
            line = in.readLine();
        }
        System.out.println(printStack(stacks));
    }

    private static String printStack(Stack[] stacks) {
        StringBuilder sb = new StringBuilder();
        for (Stack s : stacks)
            sb.append(s.peek());
        return sb.toString();
    }

    private static void initStacks(Stack[] stacks, Stack<String> queue) {
        while (!queue.isEmpty()) {
            String line = queue.pop();
            line = line.replaceAll("\\[", "");
            line = line.replaceAll("\\]", "");
            String[] array = line.split(" ");
            for (int i = 0, j = 0; i < array.length; j++) {
                if (array[i].isEmpty()) {
                    i += 4;
                    continue;
                }
                if (stacks[j] == null)
                    stacks[j] = new Stack();
                stacks[j].add(array[i]);
                i++;
            }
        }
    }

    private static int getNumber(int start, String s) {
        StringBuilder sb = new StringBuilder();
        while (start < s.length() && Character.isDigit(s.charAt(start))) {
            sb.append(s.charAt(start));
            start++;
        }
        return Integer.parseInt(sb.toString());
    }
}
