/**Class: StudentTester
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: April 5, 2024
 *
 * Purpose - To test the Student and School classes
 */

//similar to April 9th's lecture
public class StudentTester {
    public static void main(String[] args) {
        School ourSchool = new School();

        ourSchool.addStudent(new Student("Calina Winfield","CAL1234",21,3.6,101));
        ourSchool.addStudent(new Student("Kevin Booker","XYZ9247",19,3.2,23));
        ourSchool.addStudent(new Student("Linda Carhartt","HOS4198",19,3.6,25));
        ourSchool.addStudent(new Student("Reggie Parker","APG0164",20,4.0,54));
        ourSchool.addStudent(new Student("Trisha Hayward","TRJ1582",20,3.9,54));
        ourSchool.addStudent(new Student("DeShawn Lowry","FAH4578",23,3.3,98));
        ourSchool.addStudent(new Student("Tyreek Boshaw","XAS2345",18,2.9,21));


        ourSchool.listStudents();
        System.out.println(" ");

        Student oldestStudent = ourSchool.findOldestStudent();
        System.out.println("Oldest Student\n" + oldestStudent);

        Student youngestStudent = ourSchool.findYoungestStudent();
        System.out.println("Youngest Student\n" + youngestStudent);
    }
}
