package Java8;

public class Employee {
    private String name;
    private Double salary;

    public String getDept() {
        return dept;
    }

    private String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String name, Double salary, String dept){
        this.name =name;
        this.salary = salary;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
