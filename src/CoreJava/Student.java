package CoreJava;

public class Student {

    private final String name;
    private final int rollNo;
    private final String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object obj) {
        //Student s1 = (Student) obj;
       // return this.rollNo == s1.rollNo;
        return false;
    }

    @Override
    public int hashCode() {
        return this.rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", grade='" + grade + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getGrade() {
        return grade;
    }
}
