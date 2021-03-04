package src;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

class Student {
    private String name;
    private RollNumber rollNumber;
    // add the other necessary member methods here

    public Student(String name, RollNumber rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RollNumber getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(RollNumber rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) && rollNumber.equals(student.rollNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }
}
class RollNumber {
    private final BigInteger rollNumber;

    RollNumber(BigInteger rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "RollNumber{" +
                "rollNumber=" + rollNumber +
                '}';
    }
    // add the other necessary member methods here, A RollNumber object must always be immutable!
}
class RollNumberFetcher {
    public static List<RollNumber> fetchRollNumbersList(List<Student> studentsList) {
        List<RollNumber> myList = new ArrayList<>();
        for (int i = 0; i < studentsList.size(); i++) {
            myList.add(studentsList.get(i).getRollNumber());
        }
        return myList;
    }
    // create a method to fetch a roll number from a single student object, and prepend the year of joining as 19, branch code as 150, then a 000, and then the roll number in the student object call it fetchRollNumberFromStudent
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listStudent.add(new Student("Student" + String.valueOf(i+1), new RollNumber(BigInteger.valueOf(191500000 + i))));
        }
        var rollNumberList = fetchRollNumbersList(listStudent);
        for (int i = 0; i < rollNumberList.size(); i++) {
            System.out.println(rollNumberList.get(i));
        }
    }
}