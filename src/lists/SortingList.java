package lists;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 15, 5, 25);
        PriorityQueue<Integer> pqDesc = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toCollection(() ->
                        new PriorityQueue<Integer>(Comparator.reverseOrder())));
        while (!pqDesc.isEmpty()) {
            System.out.println(pqDesc.poll());
        }
    }
}
