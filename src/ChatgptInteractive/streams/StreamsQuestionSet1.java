package ChatgptInteractive.streams;

import Java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

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

        //Convert List<Employee> → Map<dept, List<Employee>>
        //Sort list of employees by name
        Employee e1 = new Employee("Pranali",200000.00,"CSE");
        Employee e2 = new Employee("Prisha",400000.00,"IT");
        Employee e3 = new Employee("Ram",600000.00,"ECE");
        Employee e4 = new Employee("Shyam",500000.00,"IT");
        Employee e5 = new Employee("Raju",100000.00,"CSE");

        List<Employee> empList = List.of(e1,e2,e3,e4,e5);
        Map<String, List<Employee>> depEmployeeMap = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("Employee Dept Map is ::"+depEmployeeMap);

        //Sort a list of employees by salary descending
        List<Employee> sortedEmployeesBySal = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toUnmodifiableList());
        System.out.println("Employees sorted by salary desc:: "+sortedEmployeesBySal);

        //Average Salary of employees per department
        Map<String, Double> avgSalByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Average Salary by department::: " +avgSalByDept);

        //Get the second highest number from a list
        List<Integer> l6 = List.of(45,87,98,43,22,56);
        Optional<Integer> secondHighest = l6.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("Second highest number is "+secondHighest.get());

        //Flatten List<List<Integer>> to List<Integer>
        List<Integer> l7 = List.of(11,12,13,14);
        List<Integer> l8 = List.of(22,33,44,55);
        List<List<Integer>> l9 = List.of(l7,l8);
        System.out.println("Flattened list is :::"+l9.stream().flatMap(x ->x.stream()).collect(Collectors.toUnmodifiableList()));

        //Find the longest string in a list
        List<String> l10 = List.of("Ram","Gopal","Shwarma","Lenskart","Afdkhkfhksdhfkjshdfkjs");
        Optional<String> longest = l10.stream().sorted(Comparator.comparing(s ->s.toString().length()).reversed()).findFirst();
        System.out.println("Longest string is::: "+longest.get());

        //Sum all odd numbers in a list
        List<Integer> l11 = List.of(56,88,77,67,90);
        Integer sumOfOdds = l11.stream().filter(i ->i%2!=0).reduce(0,Integer::sum);
        System.out.println("sumOfOdds is ::"+sumOfOdds);

        //Check if a list contains any string starting with “A”
        System.out.println(l10.stream().anyMatch(i -> i.startsWith("A")));

        //Get list of unique characters from a list of strings
        List<String> uniqueChars = l10.stream()
                .map(word -> word.split(""))     // convert each word → array of characters
                .flatMap(Arrays::stream)         // flatten multiple arrays into one stream
                .distinct()                      // keep only unique characters
                .collect(Collectors.toList());   // convert to list

        System.out.println(uniqueChars);

        //Partition numbers into even vs odd
        Map<Boolean,List<Integer>> partitionedMap = l11.stream().collect(Collectors.partitioningBy(i -> i%2 ==0));
        System.out.println("Even odd map ::"+partitionedMap);











    }
}
