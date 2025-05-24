/** TODO 4: Design the Student class first by
 * extending the Person class
 *  **/
public class Student extends Person {
    /** TODO 5: Declare two instance attributes:
     * subject and teacher
     *  **/
    String subject;
    Teacher teacher;

    /** TODO 6: Define a constructor for
     * the Student class. Make sure your class
     * includes the following:
     * name, dob, teacher, subject
     * **/
    Student(String name, Date date, Teacher teacher, String subject) {
        this.name = name;
        this.dob = date;
        this.teacher = teacher;
        this.subject = subject;
    }

    /** TODO 7: Override the getDetails() method
     * to display the student's information. The
     * methods returns all the information you
     * instructed the Student class to capture.
     *  **/
    @Override
    void getDetails() {
        System.out.println("Name of Student: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Teacher: " + this.teacher.name);
    }
}
