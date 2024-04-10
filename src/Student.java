import java.util.Objects;
/**Class: Student
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: April 5, 2024
 *
 * (Part 1 and 2 of the HW)
 * Part 1 Purpose - Create a class named student with 4 properties: id, age, gpa, and credit hours accomplished
 * Followed by constructors, getters, and setters for those properties
 * Part 2 Purpose - Create the equals() and toString() method for the Student class. The toString() method should
 * print out the name and id of the object
 */

public class Student {

    private String name;
    private String identification;
    private int age;
    private double gpa;
    private int creditHrsAccomp;

    public Student(String name, String identification, int age, double gpa, int creditHrsAccomp) {
        this.name = name;
        this.identification = identification;
        this.age = age;
        this.gpa = gpa;
        this.creditHrsAccomp = creditHrsAccomp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHrsAccomp() {
        return creditHrsAccomp;
    }

    public void setCreditHrsAccomp(int creditHrsAccomp) {
        this.creditHrsAccomp = creditHrsAccomp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(identification, student.identification);
    }

    @Override
    public String toString(){
        return String.format("Student Name: %s\nStudent ID: %s",name, identification);
    }
}
