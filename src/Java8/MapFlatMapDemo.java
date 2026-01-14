package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapDemo {
    static void main() {
        List<String> l1 = Arrays.asList("mitul","pranali");
        List<String> l2 = Arrays.asList("prisha","mumma");

        List<List<String>> collated = Arrays.asList(l1,l2);

        List<String> retList = collated.stream().flatMap(x->x.stream()).map(x -> x+x.length()).collect(Collectors.toList());
        System.out.println(retList);


    }
}
