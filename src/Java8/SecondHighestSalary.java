package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestSalary {

    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(30000,40000,10000,20000,60000);


        List<Integer> sortedList  = salaries.stream().sorted((obj1,obj2)-> -obj1.compareTo(obj2)).skip(1).collect(Collectors.toList());

        //FInd second highest
        Optional<Integer> secondHighest  = salaries.stream().sorted((obj1, obj2)-> -obj1.compareTo(obj2)).skip(1).findFirst();
        System.out.println(secondHighest.get());

        //best way
        Optional<Integer> secondHighest1  = salaries.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighest1.get());


        System.out.println(sortedList);

        //refer Employee class

        Employee e1 = new Employee("Pranali",200000.00);
        Employee e2 = new Employee("Prisha",400000.00);
        Employee e3 = new Employee("Ram",600000.00);
        Employee e4 = new Employee("Shyam",500000.00);
        Employee e5 = new Employee("Raju",100000.00);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        Optional<Employee> secondHighestSalEmp = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();
        System.out.println(secondHighestSalEmp);


    }




}
