package Java8;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamDemo {
    public static void main(String[] args) {


        List<Integer> l = Arrays.asList(2,5,6,9);

        l.parallelStream().forEach((number)-> System.out.println(number + Thread.currentThread().getName()));
        System.out.println(l.stream().reduce(2,Integer::sum));
    }
}
