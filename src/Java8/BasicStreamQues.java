package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicStreamQues {

    public static void main(String[] args) {

        //find dups
        List<Integer> l = Arrays.asList(12,13,12,11,10,14,10,10);
        Set<Integer> dups = l.stream().filter(i -> Collections.frequency(l,i) > 1).collect(Collectors.toSet());
        System.out.println(dups);

        //Sort list of employees by name
        Employee e1 = new Employee("Pranali",200000.00,"CSE");
        Employee e2 = new Employee("Prisha",400000.00,"IT");
        Employee e3 = new Employee("Ram",600000.00,"ECE");
        Employee e4 = new Employee("Shyam",500000.00,"IT");
        Employee e5 = new Employee("Raju",100000.00,"CSE");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        //sort employee list by name
        List<Employee> sortedEmployeeListByName = employeeList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortedEmployeeListByName);

        //sort employee list by salary
        List<Employee> sortedEmployeeListBySal = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortedEmployeeListBySal);

        //group employees by department
        Map<String,List<Employee>> groupByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(groupByDept);

        //Calculate total salary per dept
        Map<String,Double> totalSalByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));
        System.out.println("total sal by dept "+totalSalByDept);

        //calculate the average salary per department
        Map<String,Double> avgSalByDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("avg sal by dept "+avgSalByDept);

        //Function<Employee,String> fff = Employee::getDept;

        List<String> strList = Arrays.asList("Mitul","Pranali","Prisha");

        strList.stream().forEach(System.out::print);

    }
}
