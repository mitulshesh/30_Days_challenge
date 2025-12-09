package ChatgptInteractive.streams;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamsQuestionSet1 {

    public static void main(String[] args) {


        //Find all even numbers from a list
        List<Integer> l1 = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> evenNos = l1.stream().filter(i -> i%2==0).collect(Collectors.toUnmodifiableList());
        //UnmodifiableList is immutable which gaurentess that contents cannot be changed (java 10)
        System.out.println("Even nos are::: "+evenNos);

        //Convert List<String> to uppercase
        List<String> l2 = List.of("Pranali","Prisha","Mitul","Ram Babu");
        //Return a list
        List<String> upperCaseStr = l2.stream().map(str -> str.toUpperCase()).collect(Collectors.toUnmodifiableList());
        System.out.println("List Upper case Strings are::: "+upperCaseStr);
        //Return comma seperated String
        String upperCaseStrsCommaSeperated = l2.stream().map(str ->str.toUpperCase()).collect(Collectors.joining(","));
        System.out.println("Comma sepearted ::: "+upperCaseStrsCommaSeperated);

        //Given a list of strings, return the first non-empty string
        List<String> l3 = List.of("","","Mitul","","Pranali");
        Optional<String> firstNonEmpty = l3.stream().filter(str ->!str.isEmpty()).findFirst();
        Optional<String> secondNonEmpty = l3.stream().filter(str ->!str.isEmpty()).skip(1).findFirst();
        System.out.println("First non empty String is ::: "+firstNonEmpty.get());
        System.out.println("Second non empty String is ::: "+secondNonEmpty.get());

        //Find duplicate elements in a list using streams
        List<Integer> l4 = List.of(1,2,1,3,4,3,5,6,7,8,3,8);
        Set<Integer> dupsSet = l4.stream().filter(i-> Collections.frequency(l4,i) > 1).collect(Collectors.toUnmodifiableSet());
        System.out.println("Duplicate Elements are :: "+dupsSet);

        //Find the frequency of each word in a list
        List<String> l5 =List.of("Ram","Shyam","Raghu","Ram","Kumar","Shyam");
        Map<String,Long> frequencyMap= l5.stream().collect(Collectors.groupingBy(word -> word,Collectors.counting()));
        System.out.println(frequencyMap);








    }
}
