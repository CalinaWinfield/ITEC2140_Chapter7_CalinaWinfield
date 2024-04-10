import java.util.ArrayList;
/**Class: School
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: April 5, 2024
 *
 * (Part 3 of HW)
 * Purpose - Create a class called School that holds an ArrayList of students. Create the following methods:
 * -Constructor
 * -void addStudent(Student)
 * -void removeStudent(Student)
 * -Student findYoungestStudent()
 * -Student findOldestStudent()
 */

//similar to April 9th's lecture
public class School {
    ArrayList<Student> students;

    public School(ArrayList<Student> students) {
        this.students = students;
    }

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void listStudents() {
        for(Student individualStudent : students){
            System.out.println(individualStudent);
        }
    }

    public Student findYoungestStudent() {
        if(students.isEmpty()){
            return null;
        }
        Student youngest = students.get(0);
        for(Student student : students) {
            if(student.getAge() < youngest.getAge()){
                youngest = student;
            }
        }
        return youngest;
    }

    public Student findOldestStudent() {
        if(students.isEmpty()){
            return null;
        }
        Student oldest = students.get(0);
        for(Student student : students) {
            if(student.getAge() > oldest.getAge()){
                oldest = student;
            }
        }
        return oldest;
    }
}
